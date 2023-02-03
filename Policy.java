public class Policy
{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int holderAge;
   private String smokeStatus;
   private double holderHeight;
   private double holderWeight;
   
   // No-Arg Constructor   
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      holderAge = 0;
      smokeStatus = "";
      holderHeight = 0.0;
      holderWeight = 0.0;
   }
   
   // Default Constructor
   public Policy(int polnum, String provname, String fname, String lname, int age, String smoke, double ht, double wt)
   {
      policyNumber = polnum;
      providerName = provname;
      firstName = fname;
      lastName = lname;
      holderAge = age;
      smokeStatus = smoke;
      holderHeight = ht;
      holderWeight = wt;
   }
   
      // Policy Number Methods
      public void setPolicyNumber(int polnum)
      {
         policyNumber = polnum;
      }
      public int getPolicyNumber()
      {
         return policyNumber;
      }
      
      // Provider Name Methods
      public void setproviderName(String provname)
      {
         providerName = provname;
      }
      public String getproviderName()
      {
         return providerName;
      }
      
       // First Name Methods
      public void setfirstName(String fname)
      {
         firstName = fname;
      }
      public String getfirstName()
      {
         return firstName;
      }
      
      // Last Name Methods
      public void setlastName(String lname)
      {
         lastName = fname;
      }
      public String getlastName()
      {
         return lastName;
      }
      
      // Holder Age Methods
      public void setholderAge(int age)
      {
         holderAge = age;
      }
      public int getholderAge()
      {
         return holderAge;
      }
   
      // Smoking, Non-Smoking Methods
      public void setsmokeStatus(String smoke)
      {
         smokeStatus = smoke;
      }
      public String getsmokeStatus()
      {
         return smokeStatus;
      }
      
      // Holder Height Methods
      public void setholderHeight(double ht)
      {
         holderHeight = ht;
      }
      public double getholderHeight()
      {
         return holderHeight;
      }
      
      // Holder Weight Methods
      public void setholderWeight(double wt)
      {
         holderWeight = wt;
      }
      public double getholderWeight()
      {
         return holderWeight;
      }
      
      // Body Mass Index Method
      public double getBodyMassindex()
      {  
         double bodyMassindex = 0;
         bodyMassindex = (holderWeight * 703)/(Math.pow(holderHeight, 2.0));
         return bodyMassindex;
      }
      
      // Policy Price Method
      public double getPrice()
      {  
         double holderPrice = 600.0;
         double additionalFee = (bodyMassindex - 35) * 20;
         if (holderAge > 50)
         {
           holderPrice = baseFee + 75.0;
         }
         else if(smokeStatus == smoker)
         {
            holderPrice = holderPrice + 100.0;   
         }
         else if (bodyMassindex > 35)
         {
            holderPrice = holderPrice + additionalFee;
         }

         return holderPrice;
       }
}