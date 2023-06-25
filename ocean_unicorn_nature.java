import java.util.*;

public class PetGroomingBusiness
{
    //Instance Variables
    private String businessName;
    private String address;
    private String phoneNumber;
    private ArrayList<String> petTypesAccepted;
    private ArrayList<String> groomingServices;
    private int weeklyAppointmentLimit;
    private int numEmployees;
    private double totalRevenue;

    //Constructor
    public PetGroomingBusiness(String name, String addr, String phone)
    {
        businessName = name;
        address = addr;
        phoneNumber = phone;
        petTypesAccepted = new ArrayList <String>();
        groomingServices = new ArrayList <String>();
        weeklyAppointmentLimit = 0;
        numEmployees = 0;
        totalRevenue = 0;
    }

    //Public Methods
    public void setBusinessName(String name)
    {
        businessName = name;
    }

    public String getBusinessName()
    {
        return businessName;
    }

    public void setAddress(String addr)
    {
        address = addr;
    }

    public String getAddress()
    {
        return address;
    }

    public void setPhoneNumber(String phone)
    {
        phoneNumber = phone;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPetTypesAccepted(String petType)
    {
        petTypesAccepted.add(petType);
    }

    public ArrayList<String> getPetTypesAccepted()
    {
        return petTypesAccepted;
    }

    public void setGroomingServices(String service)
    {
        groomingServices.add(service);
    }

    public ArrayList<String> getGroomingServices()
    {
        return groomingServices;
    }

    public void setWeeklyAppointmentLimit (int limit)
    {
        weeklyAppointmentLimit = limit;
    }

    public int getWeeklyAppointmentLimit()
    {
        return weeklyAppointmentLimit;
    }

    public void setNumEmployees(int num)
    {
        numEmployees = num;
    }

    public int getNumEmployees()
    {
        return numEmployees;
    }

    public void setTotalRevenue(double r)
    {
        totalRevenue = r;
    }

    public double getTotalRevenue()
    {
        return totalRevenue;
    }
    
    //This method creates an appointment for a customer
    public void createAppointment(String petType, String groomingService, String dayOfWeek, int startHour, int endHour, double price)
    {
        //Create the new appointment
        Appointment newAppointment = new Appointment(petType, groomingService, dayOfWeek, startHour, endHour, price);
        
        //Check if the appointment is within the weekly appointment limit
        if(weeklyAppointmentLimit > 0)
        {
            //Check if the appointment conflicts with any existing appointments
            if(!checkForAppointmentConflict(newAppointment))
            {
                //Add the appointment
                addAppointment(newAppointment);
                weeklyAppointmentLimit--;
            }
            else
            {
                System.out.println("ERROR: Appointment conflicts with an existing appointment!");
            }
        }
        else
        {
            System.out.println("ERROR: Weekly appointment limit reached!");
        }
    }
    
    //This method adds an appointment to the list of appointments
    private void addAppointment(Appointment a)
    {
        //TODO: Add code to add the appointment to the list of appointments
    }
    
    //This method checks if two appointments conflict
    private boolean checkForAppointmentConflict(Appointment a)
    {
        //TODO: Add code to check if the appointment conflicts with any existing appointments
        return false; //change this to true if two appointments conflict
    }
}