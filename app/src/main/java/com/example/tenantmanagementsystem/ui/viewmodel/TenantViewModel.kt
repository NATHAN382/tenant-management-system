package com.example.tenantmanagementsystem.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.example.tenantmanagementsystem.data.model.Tenant
import com.example.tenantmanagementsystem.data.repository.TenantRepository

/**
 * ViewModel responsible for managing tenant-related UI data.
 *
 * The ViewModel separates the UI from the TenantRepository and
 * exposes tenant information through LiveData.
 */
class TenantViewModel : ViewModel() {

    /**
     * Internal MutableLiveData containing the current list of tenants.
     *
     * This property can be modified only within the ViewModel.
     */
    private val _tenants = MutableLiveData<List<Tenant>>(
        TenantRepository.tenants.toList()
    )

    /**
     * Public read-only LiveData containing the list of tenants.
     *
     * UI components can observe this value but cannot modify it directly.
     */
    val tenants: LiveData<List<Tenant>> = _tenants

    /**
     * Transformed LiveData containing the total rent.
     *
     * Whenever the tenant list changes, the map transformation
     * recalculates the total rent automatically.
     */
    val totalRent: LiveData<String> = _tenants.map { tenants ->

        // Calculate the total rent of all tenants.
        // Invalid or empty rent values are treated as 0.0.
        val total = tenants.sumOf {
            it.rent.toDoubleOrNull() ?: 0.0
        }

        // Format the total as Kenyan Shillings with two decimal places.
        "KSh %.2f".format(total)
    }

    /**
     * Adds a tenant to the repository and updates the LiveData.
     *
     * @param tenant The tenant to add.
     */
    fun addTenant(tenant: Tenant) {

        // Add the tenant to the repository.
        TenantRepository.addTenant(tenant)

        // Create a new list so observers receive the updated value.
        _tenants.value = TenantRepository.tenants.toList()
    }
}