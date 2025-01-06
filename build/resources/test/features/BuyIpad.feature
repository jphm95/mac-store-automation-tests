Feature: Buy iPad
  As a user I want to buy an iPad from the MacStore website

  Background: I am on the MacStore Web
    Given I navigate to the MacStore website and click on the "iPad" Category

  Scenario Outline: The user configures  and adds the iPad Air to shopping cart.
    When The user selects "iPad Air" from the list of devices and clicks the purchase button
    And The user selects the screen size <size>
    And The user sets the color <color>
    And The user sets the storage <storage>
    And The user decides the connectivity <connectivity>
    And The user clicks Comprar
    And The user decides AppleCare <care> program
    Examples:
      | size          | color            | storage | connectivity    | care  |
      | "iPad Air 11" | "Azul"           | "128"   | "WI-FI"         | "no"  |
      | "iPad Air 11" | "Gris Espacial"  | "256"   | "WIFI+Cellular" | "yes" |
      | "iPad Air 13" | "Blanco Estelar" | "512GB" | "WI-FI"         | "no"  |
      | "iPad Air 13" | "Morado"         | "1TB"   | "WIFI+Cellular" | "yes" |

