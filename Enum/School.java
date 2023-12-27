public class School
    {
       MonthNames monthnames;
       Days days;
       BloodGroup bloodGroup;
       Direction directions;
       DanceTypes dancetypes;
       Colours  colours;
       PlanetsName planetsname;
       Consonants  consonants;
       Seasons    seasons;
       PaymentMode paymentmode;
   
       School(MonthNames monthnames,Days days,BloodGroup bloodGroup,Direction directions,DanceTypes dancetypes,Colours  colours,PlanetsName planetsname,Consonants  consonants,Seasons seasons,PaymentMode paymentmode)
           {
               this.monthnames = monthnames;
               this.days = days;
               this.bloodGroup =bloodGroup;
               this.directions = directions;
               this.dancetypes = dancetypes;
               this. colours =  colours;
               this.planetsname = planetsname;
               this.consonants = consonants;
               this.seasons = seasons;
               this.paymentmode = paymentmode;
            }
     static void displaySchoolDetails()
             {
               System.out.println("MonthNames": +monthnames);
               System.out.println("Days" :+days);
               System.out.println("BloodGroup" :+bloodGroup);
               System.out.println("Direction" :+directions);
               System.out.println("DanceTypes" :+dancetypes);
               System.out.println("Colours"  :+colours);
               System.out.println("PlanetsName" :+planetsname);
               System.out.println("Consonants": + consonants);
               System.out.println("Seasons  " : +seasons);
               System.out.println("PaymentMode" :+paymentmode);
             }

          }