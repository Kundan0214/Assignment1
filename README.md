#First we create com.Baselayer package inside src/main/java 
Inside com.Baselayer package we create Baseclass which is super parent class of all classes
 Inside Baseclass we create one static intialization method. 
Inside this method we use System.setPropery having two arguments that is in double quote "wedriver.chrome.driver",
 and path of the ChromeDriver.By using System.setPropery we connect to the actual chromebrowser. 
Then we to create the object of ChromeDriver and instance of webdriver that is WebDriver driver=new ChromeDriver()
 this is nothing but the up casting concept. Also indide the BaseClass we use different methods like pageLoadTimeout()
 Then we use the imlicit Wait which is work for findElment() and findElements() method and it will applicable for all the elements in web page. 
To maximize the browser we use the maximize() method syntax for that is driver.manage().window(). maximize(); and
 also deleteAllCookies is used in BaseClass. Then to open a specific url we use driver.get("Url");

Inside src/main/java we create com.pagelayer package inside that we create two different classes Imdb.java and Wikipedia.java.
Inside this classes first extends the Baseclass we create the object repositories by using the @FindBy annotation
 syntax for that is @FindBy(locatorname="value of locator") and WebElement wb. Then we create the constructor,
 name of constructor is same as the class name. Constructor are the special member of class.Inside the constructor
 we use the PageFactory.initElements() by passing the webdriver instance and this keyword. 
Syntax for that is PageFactory.initElements(driver, this);.
 After constructor we create the non static method by passing the parameters 
,inside that by using the webElement instance we perform the different operation on the 
webelement or oject such as sendKey(), click as per our requirement.

#Inside src/test/java we create com.testlayer package inside that we create
 two different classes Imdbtest.java and Wikipediatest.java. 
Inside these classes first extends the Baseclass and we create the non static method
 and inside that method we call the initialization method by of BaseClass.
 Also we call all non static methods by creating the object.
Above the methods we have to use @Test annotation. 
Also we use the different annotations as @BeforeClass,@BeforeMethod,@AfterClass,@AfterMethod,@Beforetest,
 @Aftertest ,also we give priority to the test cases to mantain the execution flow. 
We can group the test cases ,also we can use dependsOnMethods,dependsOnGroups,@Parameter annotation as per our requirement.
 Here we use @BeforeClass annotation above setup method and for other methods
 we use @Test annotation and give priority to maintain the execution flow of the application.

Inside pom.xml file which is known as the heart of maven project. 
Inside that we add different types of dependencies as selenium maven dependency,testNg maven dependency,
cucumber testNg dependency etc as per requirement.
