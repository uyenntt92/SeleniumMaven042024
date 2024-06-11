package homework.locators;

public class LocatorsCRM {
    //login CRM
    public static String headerLoginPage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot password ?']";
    //dasboard
    public static String menuCustomers = "//span[normalize-space(),'Customers']";
    public static String menuProjects = "//span[normalize-space(),'Projects']";
    public static String menuTasks = "//span[normalize-space(),'Tasks']";
    public static String menuDashboard = "//span[normalize-space(),'Dashboard']";
    //Customers
    public static String buttonAddNewCustomer = "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomers = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[contains(@href,'all_contacts')]";
    // hoặc //a[normalize-space()='Import Customers']/following-sibling::a[normalize-space()='Contacts']
    public static String headerCustomerspage = "//span[normalize-space()='Customers Summary']";
    public static String inputSearchCustomers = "//div[@id='clients_filter']//input[@type='search']";
    //hoặc //div[@id='clients_filter']/descendant::input[@type='search']
    //Add New customer
    public static String inputCompanyName = "//input[@id='company']";
    public static String inputVATNumber = "//input[@id='vat']";
    public static String inputPhoneNumber = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String inputWebsite = "//input[@id='website']";
    public static String inputWebsite = "//input[@id='website']";
    public static String inputWebsite = "//input[@id='website']";
    public static String inputWebsite = "//input[@id='website']";
    public static String inputWebsite = "//input[@id='website']";
}
