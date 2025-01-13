public class UnitConverter_06 {

     // Method to convert Fahrenheit to Celsius
     public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;   // Formula: (Fahrenheit - 32) * 5 / 9
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;    // Formula: (Celsius * 9 / 5) + 32
    }

     // Method to convert pounds to kilograms
     public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592; // 1 pound = 0.453592 kilograms
    }


    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462; // 1 kilogram = 2.20462 pounds
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541; // 1 gallon = 3.78541 liters
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172; // 1 liter = 0.264172 gallons
    }


    public static void main(String[] args) {
        // Example usage of the UnitConverter methods

        // Converting Fahrenheit to Celsius
        double fahrenheit = 98.6;
        double fahrenheitToCelsius = UnitConverter_06.convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F = " + fahrenheitToCelsius + " °C");

        // Converting Celsius to Fahrenheit
        double celsius = 37.0;
        double celsiusToFahrenheit = UnitConverter_06.convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " °C = " + celsiusToFahrenheit + " °F");

        // Converting pounds to kilograms
        double pounds = 150;
        double poundsToKilograms = UnitConverter_06.convertPoundsToKilograms(pounds);
        System.out.println(pounds + " lbs = " + poundsToKilograms + " kg");

        // Converting kilograms to pounds
        double kilograms = 68;
        double kilogramsToPounds = UnitConverter_06.convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kg = " + kilogramsToPounds + " lbs");

        // Converting gallons to liters
        double gallons = 5;
        double gallonsToLiters = UnitConverter_06.convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons = " + gallonsToLiters + " liters");

        // Converting liters to gallons
        double liters = 10;
        double litersToGallons = UnitConverter_06.convertLitersToGallons(liters);
        System.out.println(liters + " liters = " + litersToGallons + " gallons");
    }
    
}