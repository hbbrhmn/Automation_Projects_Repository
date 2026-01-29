# AutomationProjectsRepository by Habiburrahman Ahmadi (Quality Assurance Engineer)

Repository ini berisi project **automation testing** berbasis **Java + Maven** menggunakan:
- **Selenium 4** (via Selenium BOM)
- **Cucumber (BDD)**
- **JUnit**
- **WebDriverManager** (auto-manage driver browser)

## Tech Stack & Versi
- **Java**: 11
- **Maven**: 3.x
- **Selenium**: `4.25.0` (managed by `selenium-bom`)
- **Cucumber**: `7.14.0`
- **WebDriverManager**: `5.6.2`
- **Test Runner**: `cucumber-junit`

## Prasyarat
Pastikan sudah ter-install:
- **JDK 11**
- **Maven**
- Browser yang ingin dipakai (Chrome/Firefox/Edge)

## Kontribusi
step-by step:
1. **Fork repo ini**
2. **Buat branch fitur: feature/nama-fitur**
3. **Commit perubahan**
4. **Buat Pull Request**

## Menjalankan Script Otomasi
step-by step:
1. **Instalasi Dependency**
mvn clean install
4. ** Menjalankan runner tertentu **
mvn -Dtest=TestRunner test
7. ** Menjalankan berdasarkan tag (opsional) **
mvn test -Dcucumber.filter.tags="@smoke"

Cek versi:
```bash
java -version
mvn -version

Struktur Project

AutomationProjectsRepository
├─ .idea/                          # Konfigurasi IntelliJ IDEA (lokal)
├─ src/
│  ├─ main/
│  │  └─ java/
│  │     ├─ base/                  # Base class (driver init/base page, dsb)
│  │     ├─ locators/              # Kumpulan locator selector (By/XPath/CSS)
│  │     ├─ pages/                 # Page Object Model (POM)
│  │     └─ utils/                 # Helper/utility (config reader, wait, dll)
│  └─ test/
│     ├─ java/
│     │  ├─ hooks/                 # Cucumber hooks (Before/After, setup/teardown)
│     │  ├─ runner/                # Cucumber runner (JUnit)
│     │  └─ steps/                 # Step definitions (Given/When/Then)
│     └─ resources/
│        ├─ config/                # File konfigurasi (env, baseUrl, browser, dll)
│        ├─ features/              # File .feature (Gherkin)
│        └─ testdata/              # Data test (json/csv/xlsx/dll)
├─ target/                         # Output build Maven (generated)
└─ pom.xml                         # Maven dependencies & configuration

