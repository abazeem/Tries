import java.util.ArrayList;
public class Testtries {
	public static void main (String[] args) throws java.lang.Exception
	{
		String[] keys = new String[] {"Afghanistan",
				"Albania",
				"Algeria",
				"Andorra",
				"Angola",
				"Argentina",
				"Armenia",
				"Australia",
				"Austria",
				"Azerbaijan",
				"Bahamas",
				"Bahrain",
				"Bangladesh",
				"Barbados",
				"Belarus",
				"Belgium",
				"Belize",
				"Benin",
				"Bhutan",
				"Bolivia",
				"Botswana",
				"Brazil",
				"BruneiDarussalam",
				"Bulgaria",
				"BurkinaFaso",
				"Burundi",
				"CaboVerde",
				"Cambodia",
				"Cameroon",
				"Canada",
				"CentralAfricanRepublic",
				"Chad",
				"Chile",
				"China",
				"Colombia",
				"Comoros",
				"Congo",
				"CostaRica",
				"CotedIvoire",
				"Croatia",
				"Cuba",
				"Cyprus",
				"CzechRepublic",
				"NorthKorea",
				"Denmark",
				"Djibouti",
				"Dominica",
				"DominicanRepublic",
				"Ecuador",
				"Egypt",
				"ElSalvador",
				"EquatorialGuinea",
				"Eritrea",
				"Estonia",
				"Ethiopia",
				"Fiji",
				"Finland",
				"France",
				"Gabon",
				"Gambia",
				"Georgia",
				"Germany",
				"Ghana",
				"Greece",
				"Grenada",
				"Guatemala",
				"Guinea",
				"GuineaBissau",
				"Guyana",
				"Haiti",
				"Honduras",
				"Hungary",
				"Iceland",
				"India",
				"Indonesia",
				"Iran",
				"Iraq",
				"Ireland",
				"Israel",
				"Italy",
				"Jamaica",
				"Japan",
				"Jordan",
				"Kazakhstan",
				"Kenya",
				"Kiribati",
				"Kuwait",
				"Kyrgyzstan",
				"Laos",
				"Latvia",
				"Lebanon",
				"Lesotho",
				"Liberia",
				"Libya",
				"Liechtenstein",
				"Lithuania",
				"Luxembourg",
				"Macedonia",
				"Madagascar",
				"Malawi",
				"Malaysia",
				"Maldives",
				"Mali",
				"Malta",
				"MarshallIslands",
				"Mauritania",
				"Mauritius",
				"Mexico",
				"Micronesia",
				"Monaco",
				"Mongolia",
				"Montenegro",
				"Morocco",
				"Mozambique",
				"Myanmar",
				"Namibia",
				"Nauru",
				"Nepal",
				"Netherlands",
				"NewZealand",
				"Nicaragua",
				"Niger",
				"Nigeria",
				"Norway",
				"Oman",
				"Pakistan",
				"Palau",
				"Panama",
				"PapuaNewGuinea",
				"Paraguay",
				"Peru",
				"Philippines",
				"Poland",
				"Portugal",
				"Qatar",
				"SouthKorea",
				"RepublicofMoldova",
				"Romania",
				"RussianFederation",
				"Rwanda",
				"SaintKittsandNevis",
				"SaintLucia",
				"Samoa",
				"SanMarino",
				"SaudiArabia",
				"Senegal",
				"Serbia",
				"Seychelles",
				"SierraLeone",
				"Singapore",
				"Slovakia",
				"Slovenia",
				"SolomonIslands",
				"Somalia",
				"SouthAfrica",
				"SouthSudan",
				"Spain",
				"SriLanka",
				"Sudan",
				"Suriname",
				"Swaziland",
				"Sweden",
				"Switzerland",
				"Syrian",
				"Tajikistan",
				"Thailand",
				"TimorLeste",
				"Togo",
				"Tonga",
				"Trinidad",
				"Tunisia",
				"Turkey",
				"Turkmenistan",
				"Tuvalu",
				"Uganda",
				"Ukraine",
				"UnitedArabEmirates",
				"UnitedKingdom",
				"United States Of America",
				"Uruguay",
				"Uzbekistan",
				"Vanuatu",
				"Venezuela",
				"Vietnam",
				"Yemen",
				"Zambia",
				"Zimbabwe"};
		Tries t = new Tries();
		for (String k : keys)
			t.add(k);
		ArrayList<String> list = new ArrayList<String>();
		list = t.intelligence("u");
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}