package com.solvd.airport;

import com.solvd.airport.exception.*;
import com.solvd.airport.info.*;
import com.solvd.airport.operations.*;
import com.solvd.airport.flightservice.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class Airport implements InformationBoard,Cargo,SecurityChecking,ImmigrationChecking
{
    private static final Logger LOGGER = (Logger) LogManager.getLogger(Airport.class);
    public final static String visaNumberUS="US1234";
    public final static int visaNumberEU=88112;
    public final static String depCity = "JFK";
    public static final double MAXWIGHT = 12.0;
    public static final int MAXLUGGAGE=2;
    public static final double MAXLUGWEIGHT = 30.0;
    public static void main(String[] args) throws LuggageMatchException {
        Airport obj = new Airport();
        LOGGER.info("Welcome To Regional Airport");
        LOGGER.info("Please follow the below Menu");
        int choice;
        Scanner mainMenu = new Scanner(System.in);
        LOGGER.info("1. Passenger CheckIn ");
        LOGGER.info("2. Arrivals and Departures");
        LOGGER.info("3. Cargo Service");
        LOGGER.info("Enter You Choice [1-3] :");
        choice = mainMenu.nextInt();

        switch (choice)
        {
            case 1:
                obj.checkOperations();
                break;
            case 2:
                obj.printArrival();
                obj.printDepartures();
                break;
            case 3:
                obj.printBoardingInvoice();
                obj.isSecurityCheckCompleted();
                break;
        }
    }
    public void checkOperations() {
        PassInfo passObj = new PassInfo();
        TravelInfo travelObj = new TravelInfo();
        FlightDate flightDate = new FlightDate();
        Scanner myObj = new Scanner(System.in);

        LOGGER.info("Enter the Passenger First Name");
        String firstName = myObj.nextLine();
        passObj.setFirstName(firstName);
        LOGGER.info("Enter the Passenger Last Name");
        String lastName = myObj.nextLine();
        passObj.setLastName(lastName);
        LOGGER.info("Enter the Passenger Gender [M/F]");
        String gender = myObj.nextLine();
        passObj.setGender(gender);
        LOGGER.info("Enter the Passenger Age");
        int age = myObj.nextInt();
        passObj.setAge(age);

        Scanner myObj1 = new Scanner(System.in);
        LOGGER.info("Your Departure City (JFK)");
        travelObj.setDeparture(depCity);
        LOGGER.info("Enter the Arrival City");
        String arrCity = myObj1.nextLine();
        travelObj.setArrival(arrCity);

        Scanner myObj2= new Scanner(System.in);
        LOGGER.info("Enter the Flight Type (Passenger/PrivateJet)");
        String fightType = myObj2.nextLine();
        LOGGER.debug("The Selected Flight Type is "+fightType);
        PassengerFlight flightObj = new PassengerFlight();
        flightObj.FlightType();
        if (fightType.equalsIgnoreCase("Passenger"))
        {
                LOGGER.info("Enter the Flight Name");
                LOGGER.info("American Airline (AA) / United Airlines (UA) / Delta (DL) / South West (SW)");
                String fightName = myObj2.nextLine();
                HashMap <Integer, String> flightMap=  new HashMap<Integer, String> ();
                flightMap.put(1412,"AA");
                flightMap.put(2103,"UA");
                flightMap.put(4313,"DL");
                flightMap.put(7273,"SW");
                for (Map.Entry<Integer, String> entry : flightMap.entrySet())
                {
                     if (entry.getValue().equals(fightName))
                     {
                        flightObj.setFlightName(fightName);
                        int flightNumber = entry.getKey();
                        LOGGER.info("Your Flight Number "+flightNumber);
                        flightObj.setFlightNumber(flightNumber);
                     }
                }
                LOGGER.info("Enter the Seat Type[Economy/Business/First]");
                Scanner myObj3 = new Scanner(System.in);
                String seatType = myObj3.nextLine();
                if (seatType.equalsIgnoreCase("Economy"))
                {
                    flightObj.setSeatType(seatType);
                    LOGGER.info("Enter the Seat Row");
                    String seatRow = myObj3.nextLine();
                    LOGGER.info("Enter the Seat Number");
                    int seatNumber = myObj3.nextInt();
                    EconomySeat seatObj = new EconomySeat(seatRow, seatNumber);
                    seatObj.setSeatRow(seatRow);
                    seatObj.setSeatNumber(seatNumber);
                    LOGGER.info("******** Your Boarding Pass *********");
                    LOGGER.info("**** "+ flightDate.currentDate()+ "****");
                    LOGGER.info("First Name :" + passObj.getFirstName() + " Last Name :" + passObj.getLastName() + " Age :" + passObj.getAge() + " Gender :" + passObj.getGender());
                    LOGGER.info("Departure City :" + travelObj.getDeparture() + " Arrival City :" + travelObj.getArrival());
                    LOGGER.info("Departure Time :" + flightDate.DepatureDate() + "Arrival Time :" + flightDate.arrivalDate());
                    LOGGER.info("Flight Number :" + flightObj.getFlightName() + " Flight Name :" + flightObj.getFlightNumber());
                    LOGGER.info("Terminal Name :" + seatObj.getSeatRow() + " Gate Number :" + seatObj.getSeatNumber());
                    LOGGER.info("************************************************");

                }
                else if (seatType.equalsIgnoreCase("Business"))
                {
                    flightObj.setSeatType(seatType);
                    Scanner myObj4 = new Scanner(System.in);
                    LOGGER.info("Enter the Seat Row");
                    String seatRow = myObj4.nextLine();
                    LOGGER.info("Enter the Seat Number");
                    int seatNumber = myObj4.nextInt();
                    LOGGER.info("Enter the Meal Type [Veg/NV/Vegan]");
                    String mealType = myObj3.nextLine();
                    LOGGER.info("Enter the Beverage Type [Hot/Cold]");
                    String bevType = myObj3.nextLine();
                    BusinessSeat businessSeat = new BusinessSeat(seatRow, seatNumber);
                    businessSeat.setMealType(mealType);
                    businessSeat.setBeverageType(bevType);


                    LOGGER.info("******** Your Boarding Pass *********");
                    LOGGER.info("First Name :" + passObj.getFirstName() + " Last Name :" + passObj.getLastName() + " Age :" + passObj.getAge() + " Gender :" + passObj.getGender());
                    LOGGER.info("Departure City :" + travelObj.getDeparture() + " Arrival City :" + travelObj.getArrival());
                    LOGGER.info("Departure Time :" + flightDate.DepatureDate() + "Arrival Time :" + flightDate.arrivalDate());
                    LOGGER.info("Flight Number :" + flightObj.getFlightName() + " Flight Name :" + flightObj.getFlightNumber());
                    LOGGER.info("Terminal Name :" + businessSeat.getSeatRow() + " Gate Number :" + businessSeat.getSeatNumber());
                    LOGGER.info("Meal Type :" + businessSeat.getMealType() + " Beverage Type :" + businessSeat.getBeverageType());
                    LOGGER.info("************************************************");

                }
                else if (seatType.equalsIgnoreCase("First"))
                {
                    flightObj.setSeatType(seatType);
                    Scanner myObj5 = new Scanner(System.in);
                    LOGGER.info("Enter the Seat Row");
                    String seatRow = myObj5.nextLine();
                    LOGGER.info("Enter the Seat Number");
                    int seatNumber = myObj5.nextInt();
                    FirstClassSeat firstClassSeat = new FirstClassSeat(seatRow, seatNumber);
                    Scanner myObj9 = new Scanner(System.in);
                    LOGGER.info("Enter the Meal Type [Veg/NV/Vegan]");
                    String mealType = myObj9.nextLine();
                    LOGGER.info("Enter the Beverage Type [Hot/Cold]");
                    String bevType = myObj9.nextLine();
                    firstClassSeat.setMealType(mealType);
                    firstClassSeat.setBeverageType(bevType);
                    LOGGER.info("Enter the Number of Luggage");
                    int luggageNumber = myObj5.nextInt();
                    try
                    {
                        if (luggageNumber > MAXLUGGAGE)
                        {
                            throw new LuggageMatchException();
                        }
                        else
                        {
                            firstClassSeat.setNoOfLuggages(luggageNumber);
                        }
                    }
                    catch (LuggageMatchException exception)
                    {
                        LOGGER.error("Luggage should be within 2 count (or) less");
                        System.exit(0);
                    }
                    LOGGER.info("Enter the Weight (in decimal)");
                    double weight = myObj5.nextDouble();
                    try
                    {
                        if (weight > MAXLUGWEIGHT)
                        {
                            throw new LugggageWeightException();
                        }
                        else
                        {
                            firstClassSeat.setWeight(weight);
                        }
                    }
                    catch (LugggageWeightException exception)
                    {
                        LOGGER.error("Luggage weight is more then required capactiy (or) not within the limits in decimal");
                        System.exit(0);
                    }

                    LOGGER.info("******** Your Boarding Pass *********");
                    LOGGER.info("First Name :" + passObj.getFirstName() + " Last Name :" + passObj.getLastName() + " Age :" + passObj.getAge() + " Gender :" + passObj.getGender());
                    LOGGER.info("Departure City :" + travelObj.getDeparture() + " Arrival City :" + travelObj.getArrival());
                    LOGGER.info("Departure Time :" + flightDate.DepatureDate() + " Arrival Time :" + flightDate.arrivalDate());
                    LOGGER.info("Flight Number :" + flightObj.getFlightName() + " Flight Name :" + flightObj.getFlightNumber());
                    LOGGER.info("Terminal Name :" + firstClassSeat.getSeatRow() + " Gate Number :" + firstClassSeat.getSeatNumber());
                    LOGGER.info("Meal Type :" + firstClassSeat.getMealType() + " Beverage Type :" + firstClassSeat.getBeverageType());
                    LOGGER.info("Number of Luggage :" + firstClassSeat.getNoOfLuggages() + " Weight :" + firstClassSeat.getWeight());
                    LOGGER.info("************************************************");
                }
                isSecurityCheckCompleted();
                isImmigrationCheckCompleted();
        }
        else if (fightType.equalsIgnoreCase("PrivateJet"))
        {
                LOGGER.info("Private Jet, Currently Unavailable");
                System.exit(0);
        }
        else
        {
            LOGGER.error("Incorrect Flight Type Selected");
        }
    }
    public void printArrival()
    {
        LOGGER.info("Regional Airport Arrivals/Departures");
        LOGGER.info("**************************************************");
        LOGGER.info("************* Arrival Information ****************");
        LOGGER.info("**************************************************");
        LOGGER.info("Flight Number   Airlines    Arrival Time    Gate");
        LOGGER.info("AA122           American    12:30 PM        G12");
        LOGGER.info("DL122           Delta       14:10 PM        A5 ");
        LOGGER.info("SW432           Swiss       16:35 PM        C38");
        LOGGER.info("UL432           United      13:40 PM        B14");
    }
    public void printDepartures()
    {
        LOGGER.info("**************************************************");
        LOGGER.info("************* Departures Information ****************");
        LOGGER.info("**************************************************");
        LOGGER.info("Flight Number   Airlines    Departure Time    Gate");
        LOGGER.info("EK290           Emirates    4:30 AM        D2");
        LOGGER.info("AI901           Air India   2:10 PM        G5 ");
        LOGGER.info("JB211           Jet Blue    6:50 AM        C10");
        LOGGER.info("UL432           United      3:20 PM        B40");
    }
    @Override
    public void printBoardingInvoice()
    {
        TravelInfo travelObj=  new TravelInfo();
        CargoFlight cargoFlight= new CargoFlight();
        Scanner myObj6 = new Scanner(System.in);
        LOGGER.info("Welcome to Regional Airport Cargo Operation");
        Scanner myObj7 = new Scanner(System.in);
        LOGGER.info("Enter the Cargo Flight Name");
        LOGGER.info("DHL / FedEX / UPS");
        String flightName = myObj7.nextLine();
        HashMap <Integer, String> flightMap=  new HashMap<Integer, String> ();
        flightMap.put(231,"DHL");
        flightMap.put(525,"FedEX");
        flightMap.put(313,"UPS");

        for (Map.Entry<Integer, String> entry : flightMap.entrySet())
        {
            if (entry.getValue().equals(flightName))
            {
                cargoFlight.setFlightName(flightName);
                int flightNumber = entry.getKey();
                LOGGER.info("Your Flight Number " + flightNumber);
                cargoFlight.setFlightNumber(flightNumber);
            }
        }
        LOGGER.info("Your Departure City (JFK)");
        travelObj.setDeparture(depCity);
        LOGGER.info("Enter the Arrival City");
        String arrCity = myObj7.nextLine();
        travelObj.setArrival(arrCity);
        LOGGER.info("Enter the Cargo Type (General/Special/Hazardous)");
        String cargoType = myObj7.nextLine();
        cargoFlight.setCargoType(cargoType);
        LOGGER.info("Enter the Supplier Name: ");
        String supplierName = myObj7.nextLine();
        cargoFlight.setSupplierName(supplierName);
        LOGGER.info("Enter the Cargo Weight (in Tons): ");
        try
        {
            double weight = myObj7.nextDouble();
            if (weight > MAXWIGHT)
            {
                throw new CargoWeightCheckException();
            }
            else
            {
                cargoFlight.setWeight(weight);
            }
        }
        catch (CargoWeightCheckException exception)
        {
            LOGGER.error("Weight Should be number/decimals (or) within 12 tons "+exception);
            System.exit(0);
        }


        LOGGER.info("******** Your Cargo Boarding Pass *********");
        LOGGER.info("Flight Number :" + cargoFlight.getFlightName() + " Flight Name :" + cargoFlight.getFlightNumber());
        LOGGER.info("Departure City :" + travelObj.getDeparture() + " Arrival City :" + travelObj.getArrival());
        LOGGER.info("Cargo Type :" + cargoFlight.getCargoType() + " Supplier Name :" + cargoFlight.getSupplierName() + "Cargo Weight : "+cargoFlight.getWeight());

    }
    @Override
    public void isSecurityCheckCompleted()
    {
        Scanner myObj8 = new Scanner(System.in);
        LOGGER.info("Enter the Passenger ID [1234567]: (Passport/Driving License/Others)");
        try
        {
            int ids = myObj8.nextInt();
            if (ids != 1234567)
            {
                throw new IdMatchException();
            }
            else
            {
                PassengerIdentity passengerIdentity = new PassengerIdentity(ids);
                passengerIdentity.setId(ids);
                LOGGER.info("valid ID " + ids);
                int ticketNumber=0;
                try {
                    LOGGER.info("Enter the 10 Digit Ticket NUmber: ");
                    ticketNumber = myObj8.nextInt();
                    int digit = (int) (Math.log10(ticketNumber)) + 1;
                    if (digit != 10)
                    {
                        throw new TicketMatchException();
                    }
                    else
                    {
                        LOGGER.info("Security Check Completed for " + ids);


                    }
                }
                catch (TicketMatchException exception) {
                    LOGGER.error("Ticket Number is not within the applicable limit (or) should be in Digits only" + exception);
                    LOGGER.info("InValid Ticket Number: " + ticketNumber);
                    System.exit(0);
                }
            }
        }
        catch (IdMatchException exception)
        {
            LOGGER.error("ID should be in digit [0-9], Unable to proceed further with Check-In/Boarding..");
            System.exit(0);
        }

    }

    @Override
    public void isImmigrationCheckCompleted() {
        Scanner myObj9 = new Scanner(System.in);
        LOGGER.info("Is Domestic/International (D/I) : ");
        String check = myObj9.nextLine();
        if (check.matches("D+")) {
            LOGGER.info("Immigration Not Required! ");
            LOGGER.info("Please proceed to gate for Boarding.. ");
            LOGGER.info("Have a Safe Journey! ");
        } else if (check.matches("I+")) {
            LOGGER.info("Please Enter the Visa Number [US1234]/[88112] ");
            String visaNumber = myObj9.nextLine();
            VisaInfo<String> visaUS = new VisaInfo<>();
            VisaInfo visaEU = new VisaInfo();
            if (visaNumber.equalsIgnoreCase(visaNumberUS))
            {
                visaUS.setVisaid(visaNumber);
                LOGGER.info("Immigration Completed for US");
                LOGGER.info("Please Proceed to Gate for International Boarding.. ");
                LOGGER.info("Have a Safe Journey! ");
            }
            else if (visaNumber.equalsIgnoreCase(String.valueOf(visaNumberEU)))
            {
                visaEU.setVisaid(visaNumber);
                LOGGER.info("Immigration Completed for EU ");
                LOGGER.info("Please Proceed to Gate for International Boarding.. ");
                LOGGER.info("Have a Safe Journey! ");
            }
            else
            {
                LOGGER.info("Please proceed to Immigration Office.. ");
                System.exit(0);
            }
        }
    }
}
