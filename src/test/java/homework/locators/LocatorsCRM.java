package homework.locators;

public class LocatorsCRM {
    //login CRM
    public static String headerLoginPage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot password ?']";
    //dasboard
    public static String menuCustomers = "//span[normalize-space()='Customers']";
    public static String menuProjects = "//span[normalize-space(),'Projects']";
    public static String menuTasks = "//span[normalize-space(),'Tasks']";
    public static String menuDashboard = "//span[normalize-space(),'Dashboard']";
    //Customers
    public static String buttonAddNewCustomer = "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomers = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[contains(@href,'all_contacts')]";
    public static String headerCustomerspage = "//span[normalize-space()='Customers Summary']";
    public static String inputSearchCustomers = "//div[@id='clients_filter']//input[@type='search']";
    //Add New customer
    public static String inputCompanyName = "//input[@id='company']";
    public static String inputVATNumber = "//input[@id='vat']";
    public static String inputPhoneNumber = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropdownGroup = "//button[@data-id='groups_in[]']";
    public static String inputSearchGroup = "//div[@app-field-wrapper='groups_in[]']//input[@type='search']";
    public static String dropdownCurrency = "//button[@data-id='default_currency']]";
    public static String inputSearchCurrency = "//div[@app-field-wrapper='default_currency']//input[@type='search']";
    public static String dropdownDefaultLanguage = "//button[@data-id='default_language']";
    public static String optionVietnamese = "//span[normalize-space()='Vietnamese']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipcode = "//input[@id='zip']";
    public static String dropdownCountry = "//div[@app-field-wrapper='country']";
    public static String inputSearchCountry= "//div[@app-field-wrapper='country']//input[@type='search']";
    public static String buttonSaveandCreateContact = "//button[normalize-space()='Save and create contact']";
    public static String buttonSave = "//div[@id='profile-save-section']//button[normalize-space()='Save']";
    //Project
    public static String buttonAddNewProject = "//a[normalize-space()='New Project']";
    public static String inputSearchProject = "//div[@id='projects_filter']//input[@type='search']";

    //Add new Project
    public static String headerAddnewproject = "////form[@id='project_form']/descendant::h4[normalize-space()='Add new project']";
    public static String inputProjectname = "//label[normalize-space()= '* Project Name']/following-sibling::input";
    public static String dropdownCustomer = "//label[@for='clientid']/following-sibling::div//button";
    public static String inputSearchCustomer = "//label[@for='clientid']/following-sibling::div//input[@type='search']";
    public static String checkboxCaculateProgress = "//input[@id='progress_from_tasks']";
    public static String sliderProgress = "//label[contains(text(),'Progress')]/following-sibling:input";
    public static String dropdownBillingtype = "//label[@for='billing_type']/following-sibling::div[contains(@class,'dropdown')]";
    public static String optionBillingtype = "//span[normalize-space()='Project Hours']";
    public static String dropdownStatus = "//label[@for='status']/following-sibling::div[contains(@class,'dropdown')]";
    public static String inputTotalRate = "//label[normalize-space()='Total Rate']/following-sibling::input";
    public static String inputEstimatedHours = "//label[normalize-space()='Estimated Hours']/following-sibling::input";
    public static String dropdownMembers = "//label[normalize-space()='Members']/following-sibling::div//button[@data-toggle='dropdown']";
    public static String inputSearchMembers = "//label[normalize-space()='Members']/following-sibling::div//input[@aria-label='Search']";
    public static String inputStartdate = "//label[@for='start_date']/following-sibling::div//input";
    public static String inputDeadline = "//label[@for='deadline']/following-sibling::div//input";
    public static String inputTags = "//label[normalize-space()='Tags']/following-sibling::input";
    public static String inputdescription = "//body[@data-id='description']";
    public static String labelSendProject = "//label[normalize-space()='Send project created email']";
    public static String checkboxSendProject = "//label[normalize-space()='Send project created email']/preceding-sibling::input";
    public static String buttonSaveProject = "//div[@class='panel-footer text-right']/child::button";

}
