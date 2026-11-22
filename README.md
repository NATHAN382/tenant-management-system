# Tenant Management System

An Android app for landlords to record tenants, see total rent, and call tenants.

## Download
Latest APK: see **Releases** on the right of this page.

## Features
- Register and log in
- Dashboard with number of tenants and total rent
- Add tenants and view all tenants (saved with Room)
- Call a tenant, options menu and navigation drawer

## Architecture
ui/    Activities, Fragments and TenantViewModel (UI layer)
data/  Tenant, TenantDao, TenantDatabase, TenantRepository (data layer)

Screens → TenantViewModel (LiveData) → TenantRepository → Room

## Team
| Stage | Member | Admission No. | Pull request |
|---|---|---|---|
| 1 Lead | Nathan Kosgei | 190440 | [PR #1](https://github.com/NATHAN382/tenant-management-system/pull/1) |
| 2 ViewModel | Jakes Murithi | 192217 | [PR #1](https://github.com/NATHAN382/tenant-management-system/pull/1) |
| 3 Room | Abdelhalim Rafa | 190390 | [PR #2](https://github.com/NATHAN382/tenant-management-system/pull/2) |
| 4 Screens | Sandra Wanja | 191728 | [PR #3](https://github.com/NATHAN382/tenant-management-system/pull/3) |
| 5 Data integration | Emmanuel Nenkikua | 184304 | [PR #4](https://github.com/NATHAN382/tenant-management-system/pull/4) |
| 6 Release | Nathan Kosgei | 190440 | [PR #5](https://github.com/NATHAN382/tenant-management-system/pull/5) |
