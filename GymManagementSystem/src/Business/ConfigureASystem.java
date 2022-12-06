package Business;

import Business.Booking.Booking;
import Business.Booking.Room;
import Business.Program.Program;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Role.SystemAdminRole;
import Business.Accounts.UserAccount;
import Business.Enterprise.GymEnterprise;
import Business.Enterprise.SalesEnterprise;
import Business.Network.Network;
import Business.Organization.TrainerOrganization;
import Business.Organization.CustomerOrganization;
import Business.Organization.ClerkOrganization;
import Business.Organization.Organization;

import static Business.Organization.Organization.Type.Sales;
import Business.Organization.SalesOrganization;
import Business.Role.Role;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.SalesRole;
import Business.Role.TrainerRole;
import Business.Role.ClerkRole;
import Business.Accounts.UserAccount;
import Business.WorkQueue.BookingRequest;
import Business.WorkQueue.ProgramRequest;
import Business.WorkQueue.ProgramReviewRequest;
import Business.Person.Customer;
import Business.Person.Person;
import Business.Role.AnalystRole;
import Business.Sales.Sales;
import Business.Role.GymManagerRole;
import Business.Role.SalesManagerRole;
import Business.WorkQueue.SalesRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akash
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Person person = system.getPersonDirectory().createPerson("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        
        testData(system);
        return system;
    }
    
    public static void testData(EcoSystem system){
        Network network = new Network();  
        
        network.setName("GymNetwork");
        
        system.getNetworkList().add(network);
        
        
        GymEnterprise gymEnterprise = (GymEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("GymEnterprise", Enterprise.EnterpriseType.Gym);
      
        SalesEnterprise salesEnterprise = (SalesEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("Sales", Enterprise.EnterpriseType.Sales);
      
        
        ArrayList<Program> courseList = gymEnterprise.getProgramDirectory().getProgramList();
        takeProgram(courseList);
        
        Organization gymOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.GymManager);
        Person gymManager1 = gymOrganization.getPersonDirectory().createPerson("Bob Manager");
        UserAccount acc1 = gymOrganization.getUserAccountDirectory().createUserAccount("manager1", "manager1", gymManager1, new GymManagerRole());
        
        
        Organization analystOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Analysis);
        Person gymAnalyst = gymOrganization.getPersonDirectory().createPerson("Walter White");
        UserAccount acc2 = gymOrganization.getUserAccountDirectory().createUserAccount("ana1", "ana1", gymAnalyst, new AnalystRole());
    
        
        Organization cusOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
        Person cus1 = cusOrganization.getPersonDirectory().createPerson("Tom Cruise");
        UserAccount acc3 = cusOrganization.getUserAccountDirectory().createUserAccount("cus1", "cus1", cus1, new CustomerRole());
        
        Organization trainerOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Trainer);
        Person trainer1 = trainerOrganization.getPersonDirectory().createPerson("Chris Bumstead");
        UserAccount acc4 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer1", "trainer1", trainer1, new TrainerRole());
        
        ArrayList<Sales> salesitemList = salesEnterprise.getSalesDirectory().getSalesList();
        
        readSalesProductList(salesitemList);
        
        Organization salesOrganization = salesEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Sales);
        
        
        Person sales1 = salesOrganization.getPersonDirectory().createPerson("Sales Unit 1");
        UserAccount acc5 = salesOrganization.getUserAccountDirectory().createUserAccount("sales1", "sales1", sales1, new SalesRole());
        
        
        Organization clerkOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Clerk);
        Person clerk1 = clerkOrganization.getPersonDirectory().createPerson("Andrew Clerk");
        UserAccount acc6 = clerkOrganization.getUserAccountDirectory().createUserAccount("clerk1", "clerk1", clerk1, new ClerkRole());
        
        takeProgramRequest(gymEnterprise);
        readSalesRequest(gymEnterprise, salesEnterprise);
        readBookingRequest(gymEnterprise);
    }
    
    public static void takeProgram(ArrayList<Program> courseList){
        File f = new File("Program.csv");
        try {
            InputStreamReader customer = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(customer);
            String l = "";
            try {
                l = br.readLine(); //read header
                while (l != null) {
                    
                    
                    String[] programData = l.split(",");
                    Program program = new Program(programData[0], Integer.parseInt(programData [1]);
                    program.setRemainSeats(Integer.parseInt(programData[1]));
                    courseList.add(program);
                    program.setDifficulties(programData[1]);
                    l = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName());
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName());
        }
    }
    
    
    public static void takeProgramRequest(GymEnterprise gymEnterprise) {
       File f = new File("ProgramRequest.csv");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String l = "";
            try {
                l = br.readLine(); //read header
                l = br.readLine();
                while (l != null) {
                    
                    String[] programRequestData = l.split(",");
                    
                    String programName = programRequestData[0];
                    Program p = null;
                    for(Program program : gymEnterprise.getProgramDirectory().getProgramList())
                        if(program.getProgramName().equals(programName)){
                            p = program;
                            break;
                        }
                    ProgramRequest programRequest = new ProgramRequest();
                    programRequest.setProgram(p);

                    UserAccount cus = null;
                    for(Organization organization : gymEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(programRequestData[1])){
                                cus = ua;
                                break;
                            }
                    
                    UserAccount manager = null;
                    for(Organization organization : gymEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(programRequestData[2])){
                                manager = ua;
                                break;
                            }            
                    
                    
                    
                    
                    
                    programRequest.setSender(cus);
                    programRequest.setReceiver(manager);
                    programRequest.setStatus(programRequestData[3]);
                    
                    programRequest.setSender(cus);
                    programRequest.setReceiver(manager);
                    
                    gymEnterprise.getProgramQueue().getProgramRequestList().add(programRequest);
                    cus.getProgramQueue().getProgramRequestList().add(programRequest);
                    l = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName();
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName());
        }
    }
    

    public static void readBookingRequest(GymEnterprise gymEnterprise) {
       File f = new File("BookingRequest.csv");
       try{
           InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
           BufferedReader br = new BufferedReader(reader);
           String l = "";
           try {
                l = br.readLine(); //read header
                l = br.readLine();
                
                while (l != null) {
                    String[] appointmentRequestData = l.split(",");
                    int roomNumber;
                    
                    Room room = null;
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    
                    Date date = null;
                    String session = appointmentRequestData[1];
                    
                    try {
                        date = df.parse(appointmentRequestData[2]);
                    } catch (ParseException ex) {
                        Logger.getLogger(ConfigureASystem.class.getName();
                    }
                    
                    UserAccount cus = null;
                    for(Organization organization : gymEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(appointmentRequestData[3])){
                                cus = ua;
                                break;
                            }
                    UserAccount trainer = null;
                    for(Organization organization : gymEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(appointmentRequestData[4])){
                                trainer = ua;
                                break;
                            }          
                    
                    Booking appointment = new Booking(date, session);
                    BookingRequest appointmentRequest = new BookingRequest(appointment);
                    appointmentRequest.setSender(cus);
                    if(!appointmentRequestData[0].equals("")){
                        roomNumber = Integer.parseInt(appointmentRequestData[0]);
                        for(Room room2 : gymEnterprise.getRoomDirec().getClassRoomList()){
                            if(room2.getNumber() == roomNumber){
                                room = room2;
                                appointment.setClassRoom(room);
                                break;
                            }
                        }
                    }
                    
                    appointmentRequest.setReceiver(trainer);
                    appointmentRequest.setStatus(appointmentRequestData[5]);
                    gymEnterprise.getBookingQueue().getAppointmentRequestList().add(appointmentRequest);
                    cus.getAppointmentQueue().getAppointmentRequestList();
                    
                    if(appointmentRequest.getStatus().equals("Cancelled"))
                        gymEnterprise.getBookingQueue().getAppointmentRequestList().remove(appointmentRequest);
                    
                    l = br.readLine();
                }
           }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName());
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName();
        }
                    
       }
    
        

    public static void readSalesRequest(GymEnterprise gymEnterprise, SalesEnterprise salesEnterprise) {
        
        File f = new File("Product_sales.csv");
        
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] productRequestData = line.split(",");
                    String productName = productRequestData[0];
                    Sales s = null;
                    for(Sales onlinesales : salesEnterprise.getSalesDirectory().getSalesList())
                        if(onlinesales.getProductName().equals(productName)){
                            s = onlinesales;
                            break;
                        }
                    HashMap<Sales, Integer> cart = new HashMap();
                    cart.put(s, Integer.parseInt(productRequestData[1]));
                    UserAccount cus = null;
                    for(Organization organization : gymEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(productRequestData[2])){
                                cus = ua;
                                break;
                            }
                    
                    UserAccount salesManager= null;
                    for(Organization organization : salesEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(productRequestData[3])){
                                salesManager = ua;
                                break;
                            }            
                    
                    SalesRequest onlinesalesRequest = new SalesRequest();
                    onlinesalesRequest.setSender(cus);
                    onlinesalesRequest.setProductOrder(cart);
                    onlinesalesRequest.setReceiver(salesManager);
                    onlinesalesRequest.setStatus(productRequestData[4]);
                    salesEnterprise.getSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
                    cus.getSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
            
                    line = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName();
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName();
        }
    }

    public static void readSalesProductList(ArrayList<Sales> salesitemList) {
        
        Sales item_no1 = new Sales("Energy Drink", 40);
        Sales item_no2 = new Sales("Protein Bar", 11);
        Sales item_no3 = new Sales("Protein Shake", 25);
        Sales item_no4 = new Sales("Veggies", 11);
        Sales item_no5 = new Sales("Mass Gainer", 30);
        Sales item_no6 = new Sales("Gym Shoes", 90);
        Sales item_no7 = new Sales("Gym Wear", 111);
        Sales item_no8 = new Sales("BCAA", 22);
        Sales item_no9 = new Sales("Pre Workout Drink", 43.3);
        Sales item_no10 = new Sales("Stretching Mat", 51.75);

        salesitemList.add(item_no1);
        salesitemList.add(item_no2);
        salesitemList.add(item_no3);
        salesitemList.add(item_no4);
        salesitemList.add(item_no5);
        salesitemList.add(item_no6);
        salesitemList.add(item_no7);
        salesitemList.add(item_no8);
        salesitemList.add(item_no9);
        salesitemList.add(item_no10);
    }  
}



