package homework.locators;

public class LocatorsCRM {
    //login CRM
    public static String headerLoginPage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot password ?']";
    public static String checkboxRemember="//input[@id='remember']";
    //dasboard
    public static String menuCustomers = "//span[normalize-space()='Customers']";
    public static String menuProjects = "//span[normalize-space()='Projects']";
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
    static public String optionCustomer = "//span[normalize-space()='CAPT']";
    public static String checkboxCaculateProgress = "//input[@id='progress_from_tasks']";
    public static String sliderProgress = "//label[contains(text(),'Progress')]/following-sibling:input";
    public static String dropdownBillingtype = "//label[@for='billing_type']/following-sibling::div[contains(@class,'dropdown')]";
    public static String optionBillingtype = "//span[normalize-space()='Project Hours']";
    public static String dropdownStatus = "//label[@for='status']/following-sibling::div[contains(@class,'dropdown')]";
    static public String optionStatus = "//span[normalize-space()='On Hold']";
    public static String inputTotalRate = "//label[normalize-space()='Rate Per Hour']/following-sibling::input";
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
    // static public String inputTags = "//label[normalize-space()='Tags']/following-sibling::input";
    static public String optionTags = "//li[@class='ui-menu-item']//div[normalize-space()='Automation Test']";

    static public String inputDescription = "//body[@data-id = 'description']";
    static public String checkboxSend = "//label[normalize-space()='Send project created email']/preceding-sibling::input";

    // Tab Project Settings
    static public String tabProjectSettings = "//li[@role='presentation']/child::a[@aria-controls='tab_settings']";
    static public String dropdownSendContactsNotifications = "//label[@for='contact_notification']/following-sibling::div//button";
    static public String optionSendContactsNotifications = "//span[normalize-space()='Do not send notifications']";
    static public String dropdownSelectContactsToNotify = "//label[normalize-space()='* Select contacts to notify']/following-sibling::div//button";
    static public String dropdownVisibleTabs = "//label[normalize-space()='Visible Tabs']/following-sibling::div//button[@data-toggle='dropdown']";
    static public String buttonSelectAll = "//label[normalize-space()='Visible Tabs']/following-sibling::div//button[normalize-space()='Select All']";
    static public String buttonDeselectAll = "//label[normalize-space()='Visible Tabs']/following-sibling::div//button[normalize-space()='Deselect All']";
    static public String optionVisibleTabs = "//label[normalize-space()='Visible Tabs']/parent::div//span[normalize-space()='Tasks']";
    static public String checkboxViewTasks = "//label[@for='view_tasks']/preceding-sibling::input";
    static public String checkboxCreateTasks = "//label[@for='create_tasks']/preceding-sibling::input";
    static public String checkboxEditTasks = "//label[@for='edit_tasks']/preceding-sibling::input";
    static public String checkboxCommentOnTasks = "//label[@for='comment_on_tasks']/preceding-sibling::input";
    static public String checkboxViewTaskComments = "//label[@for='view_task_comments']/preceding-sibling::input";
    static public String checkboxViewAttachments = "//label[@for='view_task_attachments']/preceding-sibling::input";
    static public String checkboxViewTaskChecklistItems = "//label[@for='view_task_checklist_items']/preceding-sibling::input";
    static public String checkboxUploadOnTasks = "//label[@for='upload_on_tasks']/preceding-sibling::input";
    static public String checkboxViewTaskTotalLoggedTime = "//label[@for='view_task_total_logged_time']/preceding-sibling::input";
    static public String checkboxViewFinanceOverview = "//label[@for='view_finance_overview']/preceding-sibling::input";
    static public String checkboxUploadFile = "//label[@for='upload_files']/preceding-sibling::input";
    static public String checkboxOpenDiscussions = "//label[@for='open_discussions']/preceding-sibling::input";
    static public String checkboxViewMilestones = "//label[@for='view_milestones']/preceding-sibling::input";
    static public String checkboxViewGantt = "//label[@for='view_gantt']/preceding-sibling::input";
    static public String checkboxViewTimesheets = "//label[@for='view_timesheets']/preceding-sibling::input";
    static public String checkboxViewActivityLog = "//label[@for='view_activity_log']/preceding-sibling::input";
    static public String checoboxViewTeamMembers = "//label[@for='view_team_members']/preceding-sibling::input";
    static public String checkboxHideTasks = "//label[@for='hide_tasks_on_main_tasks_table']/preceding-sibling::input";

}
