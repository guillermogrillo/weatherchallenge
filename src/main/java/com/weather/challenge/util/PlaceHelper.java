package com.weather.challenge.util;

import com.weather.challenge.dto.external.Place;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PlaceHelper {

    public Map<String, Place> completeAllPlaces() {
        Map<String, Place> woeidMap = new HashMap<String, Place>();
        woeidMap.put("2347008", new Place(
                "Bari", "SOM", "SO03"));
        woeidMap.put("7153299", new Place(
                "Hainaut", "BEL", ""));
        woeidMap.put("7153301", new Place(
                "Limburg", "BEL", ""));
        woeidMap.put("2347645", new Place(
                "Flores", "URY", "UY06"));
        woeidMap.put("2347651", new Place(
                "Río Negro", "URY", "UY12"));
        woeidMap.put("2347656", new Place(
                "Soriano", "URY", "UY17"));
        woeidMap.put("2347642", new Place(
                "Cerro Largo", "URY", "UY03"));
        woeidMap.put("2344682", new Place(
                "Rivera", "URY", "UY13"));
        woeidMap.put("2347679", new Place(
                "Apure", "VEN", "VE03"));
        woeidMap.put("2347690", new Place(
                "Mérida", "VEN", "VE14"));
        woeidMap.put("2347697", new Place(
                "Trujillo", "VEN", "VE21"));
        woeidMap.put("2347697", new Place(
                "Trujillo", "VEN", "VE23"));
        woeidMap.put("2347699", new Place(
                "Zulia", "VEN", "VE23"));
        woeidMap.put("2347684", new Place(
                "Cojedes", "VEN", "VE08"));
        woeidMap.put("2347683", new Place(
                "Carabobo", "VEN", "VE07"));
        woeidMap.put("2347694", new Place(
                "Portuguesa", "VEN", "VE18"));
        woeidMap.put("2347698", new Place(
                "Yaracuy", "VEN", "VE22"));
        woeidMap.put("2347677", new Place(
                "Amazonas", "VEN", "VE01"));
        woeidMap.put("2347682", new Place(
                "Bolívar", "VEN", "VE06"));
        woeidMap.put("2347680", new Place(
                "Aragua", "VEN", "VE04"));
        woeidMap.put("20069993", new Place(
                "Vargas", "VEN", "VE26"));
        woeidMap.put("2347686", new Place(
                "Distrito Capital", "VEN", "VE26"));
        woeidMap.put("2347700", new Place(
                "Dependencias Federales", "VEN", "VE00"));
        woeidMap.put("2347692", new Place(
                "Monagas", "VEN", "VE16"));
        woeidMap.put("2347691", new Place(
                "Miranda", "VEN", "VE15"));
        woeidMap.put("2347693", new Place(
                "Nueva Esparta", "VEN", "VE00"));
        woeidMap.put("2347695", new Place(
                "Sucre", "VEN", "VE19"));
        woeidMap.put("24549908", new Place(
                "Tobago", "TTO", "TD11"));
        woeidMap.put("2347685", new Place(
                "Delta Amacuro", "VEN", "VE09"));
        woeidMap.put("2346409", new Place(
                "Marowijne", "SUR", "NS13"));
        woeidMap.put("2346411", new Place(
                "Para", "SUR", "NS15"));
        woeidMap.put("2346407", new Place(
                "Commewijne", "SUR", "NS13"));
        woeidMap.put("2346413", new Place(
                "Saramacca", "SUR", "NS17"));
        woeidMap.put("2346392", new Place(
                "Nordland", "NOR", "JN00"));
        woeidMap.put("2345251", new Place(
                "Clare", "IRL", "EI03"));
        woeidMap.put("2345249", new Place(
                "Carlow", "IRL", "EI01"));
        woeidMap.put("2345252", new Place(
                "Cork", "IRL", "EI04"));
        woeidMap.put("2345250", new Place(
                "Cavan", "IRL", "EI02"));
        woeidMap.put("12578029", new Place(
                "Andalucía", "ESP", "SP80"));
        woeidMap.put("12578028", new Place(
                "Cantabria", "ESP", "SP85"));
        woeidMap.put("56048438", new Place(
                "Plateaux", "TGO", "TO25"));
        woeidMap.put("2347574", new Place(
                "Maritime", "TGO", "TO24"));
        woeidMap.put("56048435", new Place(
                "Kara", "TGO", "TO23"));
        woeidMap.put("2347574", new Place(
                "Centre", "TGO", "TO22"));
        woeidMap.put("56048434", new Place(
                "Savanes", "TGO", "TO26"));
        woeidMap.put("2346327", new Place(
                "Maradi", "NER", "NG04"));
        woeidMap.put("2346330", new Place(
                "Zinder", "NER", "NG07"));
        woeidMap.put("12578034", new Place(
                "Cataluña", "ESP", "SP86"));
        woeidMap.put("2346631", new Place(
                "Dolj", "ROU", "RO17"));
        woeidMap.put("2346633", new Place(
                "Gorj", "ROU", "RO19"));
        woeidMap.put("2346639", new Place(
                "Mehedinti", "ROU", "RO26"));
        woeidMap.put("2346642", new Place(
                "Olt", "ROU", "RO29"));
        woeidMap.put("2346648", new Place(
                "Teleorman", "ROU", "RO35"));
        woeidMap.put("2346636", new Place(
                "Ialomita", "ROU", "RO22"));
        woeidMap.put("20070038", new Place(
                "Sa`dah", "YEM", "YM15"));
        woeidMap.put("20070041", new Place(
                "Ta`izz", "YEM", "YM25"));
        woeidMap.put("2347108", new Place(
                "Jura", "CHE", "SZ26"));
        woeidMap.put("2347083", new Place(
                "Aargau", "CHE", "SZ01"));
        woeidMap.put("2347095", new Place(
                "Nidwalden", "CHE", "SZ13"));
        woeidMap.put("2347104", new Place(
                "Valais", "CHE", "SZ22"));
        woeidMap.put("2347084", new Place(
                "Appenzell Ausserrhoden", "CHE", "SZ02"));
        woeidMap.put("2347102", new Place(
                "Ticino", "CHE", "SZ20"));
        woeidMap.put("2347091", new Place(
                "Graubünden", "CHE", "SZ09"));
        woeidMap.put("2347101", new Place(
                "Thurgau", "CHE", "SZ19"));
        woeidMap.put("2347103", new Place(
                "Uri", "CHE", "SZ21"));
        woeidMap.put("2347046", new Place(
                "Gävleborg", "SWE", "SW03"));
        woeidMap.put("2347053", new Place(
                "Dalarna", "SWE", "SW10"));
        woeidMap.put("2347055", new Place(
                "Kronoberg", "SWE", "SW12"));
        woeidMap.put("2347059", new Place(
                "Östergötland", "SWE", "SW16"));
        woeidMap.put("2347061", new Place(
                "Södermanland", "SWE", "SW18"));
        woeidMap.put("2347066", new Place(
                "Västmanland", "SWE", "SW25"));
        woeidMap.put("2347049", new Place(
                "Halland", "SWE", "SW06"));
        woeidMap.put("2347063", new Place(
                "Värmland", "SWE", "SW22"));
        woeidMap.put("2347050", new Place(
                "Jämtland", "SWE", "SW07"));
        woeidMap.put("2347057", new Place(
                "Norrbotten", "SWE", "SW14"));
        woeidMap.put("2347065", new Place(
                "Västernorrland", "SWE", "SW24"));
        woeidMap.put("2347064", new Place(
                "Västerbotten", "SWE", "SW23"));
        woeidMap.put("2347048", new Place(
                "Gotland", "SWE", "SW18"));
        woeidMap.put("55848361", new Place(
                "Sveta Ana", "SVN", "SI00"));
        woeidMap.put("55848364", new Place(
                "Dobrova - Polhov Gradec", "SVN", "SIG4"));
        woeidMap.put("55848394", new Place(
                "Loka Dolina", "SVN", "SII7"));
        woeidMap.put("55848390", new Place(
                "Bistrica ob Sotli", "SVN", "SI92"));
        woeidMap.put("55848388", new Place(
                "Slovenska Bistrica", "SVN", "SIL8"));
        woeidMap.put("55848377", new Place(
                "Videm", "SVN", "SIN2"));
        woeidMap.put("55848377", new Place(
                "Hajdina", "SVN", "SI00"));
        woeidMap.put("55848367", new Place(
                "Hoce - Slivnica", "SVN", "SI00"));
        woeidMap.put("55848377", new Place(
                "Trnovska Vas", "SVN", "SI00"));
        woeidMap.put("55848382", new Place(
                "Selnica ob Dravi", "SVN", "SI00"));
        woeidMap.put("55848382", new Place(
                "Lovrenc na Pohorju", "SVN", "SI00"));
        woeidMap.put("55848358", new Place(
                "Jezersko", "SVN", "SI00"));
        woeidMap.put("55848349", new Place(
                "Dobrepolje", "SVN", "SI00"));
        woeidMap.put("55848378", new Place(
                "Ribnica na Pohorju", "SVN", "SIA5"));
        woeidMap.put("2347045", new Place(
                "Blekinge", "SWE", "SW02"));
        woeidMap.put("2346619", new Place(
                "Bihor", "ROU", "RO05"));
        woeidMap.put("2346626", new Place(
                "Caras - Severin", "ROU", "RO12"));
        woeidMap.put("2346649", new Place(
                "Timis", "ROU", "RO36"));
        woeidMap.put("2347544", new Place(
                "Crimea", "UKR", "UP08"));
        woeidMap.put("2346615", new Place(
                "Alba", "ROU", "RO01"));
        woeidMap.put("2346638", new Place(
                "Maramures", "ROU", "RO25"));
        woeidMap.put("2346640", new Place(
                "Mures", "ROU", "RO27"));
        woeidMap.put("2346644", new Place(
                "Salaj", "ROU", "RO31"));
        woeidMap.put("2346617", new Place(
                "Arges", "ROU", "RO03"));
        woeidMap.put("2346634", new Place(
                "Harghita", "ROU", "RO20"));
        woeidMap.put("2346641", new Place(
                "Neamt", "ROU", "RO28"));
        woeidMap.put("2346643", new Place(
                "Prahova", "ROU", "RO30"));
        woeidMap.put("2346653", new Place(
                "Vrancea", "ROU", "RO40"));
        woeidMap.put("2347555", new Place(
                "Volyn", "UKR", "UP21"));
        woeidMap.put("20070032", new Place(
                "Al Mahrah", "YEM", "YM03"));
        woeidMap.put("20070043", new Place(
                "Al Bayda '	", "	YEM	", "	YM20	"));
        woeidMap.put("2347110", new Place(
                "Ajman", "ARE", "AE02"));
        woeidMap.put("2347114", new Place(
                "Sharjah", "ARE", "AE06"));
        woeidMap.put("2347109", new Place(
                "Abu Dhabi", "ARE", "AE01"));
        woeidMap.put("20070295", new Place(
                "Khatlon", "TJK", "TI03"));
        woeidMap.put("20070018", new Place(
                "Rapti", "NPL", "NP12"));
        woeidMap.put("2347183", new Place(
                "Ranong", "THA", "TH59"));
        woeidMap.put("2347134", new Place(
                "Phrae", "THA", "TH07"));
        woeidMap.put("2347165", new Place(
                "Bangkok Metropolis", "THA", "TH40"));
        woeidMap.put("2347720", new Place(
                "Dak Lak", "VNM", "VM07"));
        woeidMap.put("2345728", new Place(
                "Riau", "IDN", "ID37"));
        woeidMap.put("28350156", new Place(
                "Sulawesi Utara", "IDN", "ID31"));
        woeidMap.put("2347808", new Place(
                "Luapula", "ZMB", "ZA04"));
        woeidMap.put("2347807", new Place(
                "Northern", "ZMB", "ZA05"));
        woeidMap.put("2347805", new Place(
                "Central", "ZMB", "ZA02"));
        woeidMap.put("2347802", new Place(
                "Copperbelt", "ZMB", "ZA08"));
        woeidMap.put("2347801", new Place(
                "North - Western", "ZMB", "ZA06"));
        woeidMap.put("2347812", new Place(
                "Mashonaland Central", "ZWE", "ZI03"));
        woeidMap.put("2347811", new Place(
                "Midlands", "ZWE", "ZI02"));
        woeidMap.put("2347813", new Place(
                "Mashonaland East", "ZWE", "ZI04"));
        woeidMap.put("2347810", new Place(
                "Manicaland", "ZWE", "ZI01"));
        woeidMap.put("2347814", new Place(
                "Mashonaland West", "ZWE", "ZI05"));
        woeidMap.put("20069889", new Place(
                "Hhohho", "SWZ", "WZ01"));
        woeidMap.put("20069891", new Place(
                "Lubombo", "SWZ", "WZ02"));
        woeidMap.put("20069892", new Place(
                "Manzini", "SWZ", "WZ03"));
        woeidMap.put("20069890", new Place(
                "Shiselweni", "SWZ", "WZ04"));
        woeidMap.put("20069998", new Place(
                "Maluku Utara", "IDN", "ID29"));
        woeidMap.put("2345719", new Place(
                "Yogyakarta", "IDN", "ID10"));
        woeidMap.put("20069997", new Place(
                "Maluku", "IDN", "ID28"));
        woeidMap.put("2345726", new Place(
                "Nusa Tenggara Barat", "IDN", "ID17"));
        woeidMap.put("2345731", new Place(
                "Sulawesi Tenggara", "IDN", "ID22"));
        woeidMap.put("2345730", new Place(
                "Sulawesi Tengah", "IDN", "ID21"));
        woeidMap.put("2345718", new Place(
                "Papua", "IDN", "ID36"));
        woeidMap.put("24549806", new Place(
                "Nord", "NCL", "NC00"));
        woeidMap.put("20069883", new Place(
                "Torba", "VUT", "NH07"));
        woeidMap.put("20069884", new Place(
                "Sanma", "VUT", "NH13"));
        woeidMap.put("20069887", new Place(
                "Tafea", "VUT", "NH15"));
        woeidMap.put("20069886", new Place(
                "Malampa", "VUT", "NH16"));
        woeidMap.put("20069888", new Place(
                "Shefa", "VUT", "NH18"));
        woeidMap.put("2346470", new Place(
                "Apurímac", "PER", "PE03"));
        woeidMap.put("2346484", new Place(
                "Madre de Dios", "PER", "PE17"));
        woeidMap.put("2346485", new Place(
                "Moquegua", "PER", "PE18"));
        woeidMap.put("2344844", new Place(
                "Acre", "BRA", "BR01"));
        woeidMap.put("2346469", new Place(
                "Ancash", "PER", "PE02"));
        woeidMap.put("2346480", new Place(
                "La Libertad", "PER", "PE13"));
        woeidMap.put("2346486", new Place(
                "Pasco", "PER", "PE19"));
        woeidMap.put("2346489", new Place(
                "San Martín", "PER", "PE22"));
        woeidMap.put("2346492", new Place(
                "Ucayali", "PER", "PE25"));
        woeidMap.put("2346468", new Place(
                "Amazonas", "PER", "PE01"));
        woeidMap.put("2346483", new Place(
                "Loreto", "PER", "PE16"));
        woeidMap.put("2346472", new Place(
                "Ayacucho", "PER", "PE09"));
        woeidMap.put("2346482", new Place(
                "Lima Province", "PER", ""));
        woeidMap.put("2346482", new Place(
                "Lima", "PER", "PE15"));
        woeidMap.put("2344847", new Place(
                "Amazonas", "BRA", "BR04"));
        woeidMap.put("2344854", new Place(
                "Maranhão", "BRA", "BR13"));
        woeidMap.put("2344857", new Place(
                "Pará", "BRA", "BR16"));
        woeidMap.put("2344865", new Place(
                "Rondônia", "BRA", "BR24"));
        woeidMap.put("2344870", new Place(
                "Tocantins", "BRA", "BR31"));
        woeidMap.put("2346463", new Place(
                "Alto Paraguay", "PRY", "PA03"));
        woeidMap.put("2346450", new Place(
                "Boquerón", "PRY", "PA24"));
        woeidMap.put("2344850", new Place(
                "Distrito Federal", "BRA", "BR07"));
        woeidMap.put("2344853", new Place(
                "Mato Grosso do Sul	", "BRA	", "BR11	"));
        woeidMap.put("2344856", new Place(
                "Minas Gerais", "BRA", "BR15"));
        woeidMap.put("2344855", new Place(
                "Mato Grosso", "BRA", "BR14"));
        woeidMap.put("2346455", new Place(
                "Cordillera", "PRY", "PA08"));
        woeidMap.put("2346461", new Place(
                "Presidente Hayes", "PRY", "PA16"));
        woeidMap.put("2346456", new Place(
                "Guairá", "PRY", "PA10"));
        woeidMap.put("2346458", new Place(
                "Misiones", "PRY", "PA12"));
        woeidMap.put("2346459", new Place(
                "Ñeembucú", "PRY", "PA13"));
        woeidMap.put("2344859", new Place(
                "Paraná", "BRA", "BR18"));
        woeidMap.put("2344867", new Place(
                "Santa Catarina", "BRA", "BR26"));
        woeidMap.put("2346449", new Place(
                "Amambay", "PRY", "PA02"));
        woeidMap.put("2346448", new Place(
                "Alto Paraná", "PRY", "PA01"));
        woeidMap.put("2346464", new Place(
                "Canindeyú", "PRY", "PA19"));
        woeidMap.put("2346457", new Place(
                "Itapúa", "PRY", "PA11"));
        woeidMap.put("2344849", new Place(
                "Ceará", "BRA", "BR06"));
        woeidMap.put("2344861", new Place(
                "Piauí", "BRA", "BR20"));
        woeidMap.put("2344845", new Place(
                "Alagoas", "BRA", "BR02"));
        woeidMap.put("2344848", new Place(
                "Bahia", "BRA", "BR05"));
        woeidMap.put("2344851", new Place(
                "Espírito Santo", "BRA", "BR08"));
        woeidMap.put("2344858", new Place(
                "Paraíba", "BRA", "BR17"));
        woeidMap.put("2344863", new Place(
                "Rio Grande do Norte	", "BRA	", "BR22	"));
        woeidMap.put("2344869", new Place(
                "Sergipe", "BRA", "BR28"));
        woeidMap.put("2344917", new Place(
                "Manitoba", "CAN", "CA03"));
        woeidMap.put("2344925", new Place(
                "Saskatchewan", "CAN", "CA11"));
        woeidMap.put("2344915", new Place(
                "Alberta", "CAN", "CA01"));
        woeidMap.put("20069920", new Place(
                "Nunavut", "CAN", "CA10"));
        woeidMap.put("2344920", new Place(
                "Northwest Territories", "CAN", "CA13"));
        woeidMap.put("2344926", new Place(
                "Yukon", "CAN", "CA12"));
        woeidMap.put("2345623", new Place(
                "Atlántida", "HND", "HO01"));
        woeidMap.put("2345625", new Place(
                "Colón", "HND", "HO03"));
        woeidMap.put("2345630", new Place(
                "Francisco Morazán", "HND", "HO08"));
        woeidMap.put("2345631", new Place(
                "Gracias a Dios", "HND", "HO09"));
        woeidMap.put("2345633", new Place(
                "Islas de la Bahía", "HND", "HO01"));
        woeidMap.put("2345637", new Place(
                "Olancho", "HND", "HO15"));
        woeidMap.put("2345639", new Place(
                "Valle", "HND", "HO17"));
        woeidMap.put("2345628", new Place(
                "Cortés", "HND", "HO06"));
        woeidMap.put("2345627", new Place(
                "Copán", "HND", "HO05"));
        woeidMap.put("2345635", new Place(
                "Lempira", "HND", "HO13"));
        woeidMap.put("2346418", new Place(
                "Carazo", "NIC", "NU02"));
        woeidMap.put("2346425", new Place(
                "Madriz", "NIC", "NU09"));
        woeidMap.put("2346429", new Place(
                "Nueva Segovia", "NIC", "NU13"));
        woeidMap.put("2346420", new Place(
                "Chontales", "NIC", "NU04"));
        woeidMap.put("2344866", new Place(
                "Roraima", "BRA", "BR25"));
        woeidMap.put("2345608", new Place(
                "Mahaica - Berbice", "GUY", "GY13"));
        woeidMap.put("2345610", new Place(
                "Potaro - Siparuni", "GUY", "GY17"));
        woeidMap.put("2345612", new Place(
                "Upper Takutu - Upper Essequibo", "GUY", "GY18"));
        woeidMap.put("2345611", new Place(
                "Upper Demerara - Berbice", "GUY", "GY19"));
        woeidMap.put("2345603", new Place(
                "Barima - Waini", "GUY", "GY10"));
        woeidMap.put("2345609", new Place(
                "Pomeroon - Supenaam", "GUY", "GY11"));
        woeidMap.put("2345606", new Place(
                "East Berbice - Corentyne", "GUY", "GY12"));
        woeidMap.put("2345607", new Place(
                "Essequibo Islands - West Demerara", "GUY", "GY15"));
        woeidMap.put("2345604", new Place(
                "Cuyuni - Mazaruni", "GUY", "GY16"));
        woeidMap.put("2344922", new Place(
                "Ontario", "CAN", "CA08"));
        woeidMap.put("2344924", new Place(
                "Québec", "CAN", "CA10"));
        woeidMap.put("2344922", new Place(
                "New Brunswick", "CAN", "CA04"));
        woeidMap.put("2344922", new Place(
                "Nova Scotia", "CAN", "CA07"));
        woeidMap.put("2344923", new Place(
                "Prince Edward Island", "CAN", "CA09"));
        woeidMap.put("2345255", new Place(
                "Galway", "IRL", "EI10"));
        woeidMap.put("2345265", new Place(
                "Meath", "IRL", "EI21"));
        woeidMap.put("2345267", new Place(
                "Offaly", "IRL", "EI23"));
        woeidMap.put("2345272", new Place(
                "Westmeath", "IRL", "EI29"));
        woeidMap.put("2345273", new Place(
                "Wexford", "IRL", "EI30"));
        woeidMap.put("2345274", new Place(
                "Wicklow", "IRL", "EI31"));
        woeidMap.put("2345254", new Place(
                "Dublin", "IRL", "EI07"));
        woeidMap.put("2345258", new Place(
                "Kilkenny", "IRL", "EI13"));
        woeidMap.put("2345260", new Place(
                "Laoighis", "IRL", "EI15"));
        woeidMap.put("2345270", new Place(
                "Tipperary", "IRL", "EI26"));
        woeidMap.put("2345256", new Place(
                "Kerry", "IRL", "EI11"));
        woeidMap.put("2345261", new Place(
                "Limerick", "IRL", "EI16"));
        woeidMap.put("2345268", new Place(
                "Roscommon", "IRL", "EI24"));
        woeidMap.put("2345269", new Place(
                "Sligo", "IRL", "EI25"));
        woeidMap.put("15021776", new Place(
                "Azores", "PRT", "PO23"));
        woeidMap.put("2346570", new Place(
                "Madeira", "PRT", "PO10"));
        woeidMap.put("12578036", new Place(
                "Galicia", "ESP", "SP91"));
        woeidMap.put("12578035", new Place(
                "Extremadura", "ESP", "SP90"));
        woeidMap.put("2347001", new Place(
                "Northern", "SLE", "SL02"));
        woeidMap.put("56055615", new Place(
                "Matam", "SEN", "SG14"));
        woeidMap.put("2346605", new Place(
                "Oio", "GNB", "PU04"));
        woeidMap.put("2346604", new Place(
                "Quinara", "GNB", "PU02"));
        woeidMap.put("2346608", new Place(
                "Tombali", "GNB", "PU07"));
        woeidMap.put("2346107", new Place(
                "Maryland", "LBR", "LI13"));
        woeidMap.put("2346109", new Place(
                "Bomi", "LBR", "LI15"));
        woeidMap.put("2346099", new Place(
                "Bong", "LBR", "LI01"));
        woeidMap.put("2346106", new Place(
                "Grand Cape Mount", "LBR", "LI12"));
        woeidMap.put("2346101", new Place(
                "Lofa", "LBR", "LI20"));
        woeidMap.put("2346108", new Place(
                "Montserrado", "LBR", "LI14"));
        woeidMap.put("2346111", new Place(
                "Margibi", "LBR", "LI17"));
        woeidMap.put("2346103", new Place(
                "Nimba", "LBR", "LI09"));
        woeidMap.put("2345090", new Place(
                "Basse - Kotto", "CAF", "CT02"));
        woeidMap.put("2345095", new Place(
                "Lobaye", "CAF", "CT07"));
        woeidMap.put("20069894", new Place(
                "West Darfur", "SDN", "SU47"));
        woeidMap.put("2345036", new Place(
                "Ouest", "CMR", "CM08"));
        woeidMap.put("2346324", new Place(
                "Agadez", "NER", "NG01"));
        woeidMap.put("2345092", new Place(
                "Mambéré - Kadéï", "CAF", "CT04"));
        woeidMap.put("2345103", new Place(
                "Sangha - Mbaéré", "CAF", "CT16"));
        woeidMap.put("2345042", new Place(
                "Sud", "CMR", "CM14"));
        woeidMap.put("2345097", new Place(
                "Nana - Mambéré", "CAF", "CT09"));
        woeidMap.put("2345100", new Place(
                "Ouham - Pendé", "CAF", "CT13"));
        woeidMap.put("2345089", new Place(
                "Bamingui - Bangoran", "CAF", "CT01"));
        woeidMap.put("2345102", new Place(
                "Nana - Grébizi", "CAF", "CT15"));
        woeidMap.put("2345094", new Place(
                "Kémo", "CAF", "CT06"));
        woeidMap.put("2345099", new Place(
                "Ouham", "CAF", "CT12"));
        woeidMap.put("20069893", new Place(
                "South Darfur", "SDN", "SU49"));
        woeidMap.put("7153334", new Place(
                "Emilia - Romagna", "ITA", "IT05"));
        woeidMap.put("7153337", new Place(
                "Liguria", "ITA", "IT12"));
        woeidMap.put("7153343", new Place(
                "Sardegna", "ITA", "IT14"));
        woeidMap.put("7153345", new Place(
                "Toscana", "ITA", "IT16"));
        woeidMap.put("7153331", new Place(
                "Basilicata", "ITA", "IT02"));
        woeidMap.put("7153332", new Place(
                "Calabria", "ITA", "IT03"));
        woeidMap.put("7153333", new Place(
                "Campania", "ITA", "IT04"));
        woeidMap.put("7153340", new Place(
                "Molise", "ITA", "IT11"));
        woeidMap.put("7153342", new Place(
                "Apulia", "ITA", "IT13"));
        woeidMap.put("7153344", new Place(
                "Sicily", "ITA", "IT15"));
        woeidMap.put("7153350", new Place(
                "Abruzzo", "ITA", "IT01"));
        woeidMap.put("7153336", new Place(
                "Lazio", "ITA", "IT07"));
        woeidMap.put("7153339", new Place(
                "Marche", "ITA", "IT10"));
        woeidMap.put("7153347", new Place(
                "Umbria", "ITA", "IT18"));
        woeidMap.put("29389201", new Place(
                "Ðakovica", "KO -", "AL47"));
        woeidMap.put("29389217", new Place(
                "Grad Beograd", "SRB", "RB02"));
        woeidMap.put("29389214", new Place(
                "Kolubarski", "SRB", "BK00"));
        woeidMap.put("29389214", new Place(
                "Macvanski", "SRB", "BK00"));
        woeidMap.put("29389201", new Place(
                "Kosovska Mitrovica", "KO -", "SR01"));
        woeidMap.put("2347562", new Place(
                "Tafilah", "JOR", "JO12"));
        woeidMap.put("2347580", new Place(
                "Ma`an", "JOR", "JO19"));
        woeidMap.put("20070293", new Place(
                "Ajlun", "JOR", "JO20"));
        woeidMap.put("2347562", new Place(
                "Balqa", "JOR", "JO02"));
        woeidMap.put("2346961", new Place(
                "Al Hudud ash Shamaliyah", "SAU", "SA15"));
        woeidMap.put("2345093", new Place(
                "Haut - Mbomou", "CAF", "CT05"));
        woeidMap.put("2345096", new Place(
                "Mbomou", "CAF", "CT08"));
        woeidMap.put("20069895", new Place(
                "North Darfur", "SDN", "SU55"));
        woeidMap.put("2346949", new Place(
                "Al Bahah", "SAU", "SA02"));
        woeidMap.put("2346955", new Place(
                "`Asir", "SAU", "SA11"));
        woeidMap.put("2346956", new Place(
                "Jizan", "SAU", "SA17"));
        woeidMap.put("2346959", new Place(
                "Makkah", "SAU", "SA14"));
        woeidMap.put("2345943", new Place(
                "Rift Valley", "KEN", "KE08"));
        woeidMap.put("2345941", new Place(
                "North - Eastern", "KEN", "KE06"));
        woeidMap.put("2346373", new Place(
                "Drenthe", "NLD", "NL01"));
        woeidMap.put("2346374", new Place(
                "Friesland", "NLD", "NL02"));
        woeidMap.put("2346375", new Place(
                "Gelderland", "NLD", "NL03"));
        woeidMap.put("2346377", new Place(
                "Limburg", "NLD", "NL05"));
        woeidMap.put("2346380", new Place(
                "Overijssel", "NLD", "NL15"));
        woeidMap.put("2346401", new Place(
                "Troms", "NOR", "NO18"));
        woeidMap.put("2346384", new Place(
                "Flevoland", "NLD", "NL16"));
        woeidMap.put("2346382", new Place(
                "Zeeland", "NLD", "NL10"));
        woeidMap.put("7153341", new Place(
                "Piemonte", "ITA", "IT12"));
        woeidMap.put("7153348", new Place(
                "Valle d 'Aosta	", "	ITA	", "	IT19	"));
        woeidMap.put("7153338", new Place(
                "Lombardia", "ITA", "IT09"));
        woeidMap.put("2346391", new Place(
                "Møre og Romsdal", "NOR", "NO08"));
        woeidMap.put("2346399", new Place(
                "Sør - Trøndelag", "NOR", "NO16"));
        woeidMap.put("2346386", new Place(
                "Aust - Agder", "NOR", "NO02"));
        woeidMap.put("2346390", new Place(
                "Hordaland", "NOR", "NO07"));
        woeidMap.put("2346397", new Place(
                "Rogaland", "NOR", "NO14"));
        woeidMap.put("2346398", new Place(
                "Sogn og Fjordane", "NOR", "NO15"));
        woeidMap.put("2346402", new Place(
                "Vest - Agder", "NOR", "NO19"));
        woeidMap.put("2346385", new Place(
                "Akershus", "NOR", "NO01"));
        woeidMap.put("2346387", new Place(
                "Buskerud", "NOR", "NO04"));
        woeidMap.put("2346389", new Place(
                "Hedmark", "NOR", "NO06"));
        woeidMap.put("2346394", new Place(
                "Oppland", "NOR", "NO11"));
        woeidMap.put("2346400", new Place(
                "Telemark", "NOR", "NO17"));
        woeidMap.put("2346403", new Place(
                "Vestfold", "NOR", "NO20"));
        woeidMap.put("2346396", new Place(
                "Østfold", "NOR", "NO13"));
        woeidMap.put("2346393", new Place(
                "Nord - Trøndelag", "NOR", "NO10"));
        woeidMap.put("55848348", new Place(
                "Gornja Radgona", "SVN", "SI29"));
        woeidMap.put("55848370", new Place(
                "Gornji Petrovci", "SVN", "SI31"));
        woeidMap.put("55848370", new Place(
                "Gornji Petrovci", "SVN", "SI97"));
        woeidMap.put("55848085", new Place(
                "Klaipedos", "LTU", "LH58"));
        woeidMap.put("55848364", new Place(
                "Dol pri Ljubljani", "SVN", "SI22"));
        woeidMap.put("55848347", new Place(
                "Dravograd", "SVN", "SI25"));
        woeidMap.put("55848367", new Place(
                "Duplek", "SVN", "SI26"));
        woeidMap.put("55848369", new Place(
                "Gornji Grad", "SVN", "SI30"));
        woeidMap.put("55848397", new Place(
                "Hrastnik", "SVN", "SI34"));
        woeidMap.put("55848349", new Place(
                "Ivancna Gorica", "SVN", "SI39"));
        woeidMap.put("55848374", new Place(
                "Kungota", "SVN", "SI55"));
        woeidMap.put("55848367", new Place(
                "Race - Fram", "SVN", "SI98"));
        woeidMap.put("55848390", new Place(
                "Rogaka Slatina", "SVN", "SIA7"));
        woeidMap.put("55848389", new Place(
                "Slovenske Konjice", "SVN", "SIC4"));
        woeidMap.put("7153336", new Place(
                "tore", "SVN", "SIC9"));
        woeidMap.put("55848379", new Place(
                "Bohinj", "SVN", "SI04"));
        woeidMap.put("55848354", new Place(
                "Kranjska Gora", "SVN", "SI53"));
        woeidMap.put("55848371", new Place(
                "Brda", "SVN", "SI07"));
        woeidMap.put("55848385", new Place(
                "Divaca", "SVN", "SI19"));
        woeidMap.put("55848385", new Place(
                "Hrpelje - Kozina", "SVN", "SI35"));
        woeidMap.put("55848371", new Place(
                "Miren - Kostanjevica", "SVN", "SIJ5"));
        woeidMap.put("7153335", new Place(
                "Friuli - Venezia Giulia", "ITA", "IT06"));
        woeidMap.put("7153346", new Place(
                "Trentino - Alto Adige", "ITA", "IT17"));
        woeidMap.put("7153349", new Place(
                "Veneto", "ITA", "IT20"));
        woeidMap.put("55848370", new Place(
                "Moravske Toplice", "SVN", "SI78"));
        woeidMap.put("55848390", new Place(
                "Sveti Jurij", "SVN", "SID1"));
        woeidMap.put("20070492", new Place(
                "Nitriansky", "SVK", "SI04"));
        woeidMap.put("20070493", new Place(
                "Trenciansky", "SVK", "SI06"));
        woeidMap.put("2346388", new Place(
                "Finnmark", "NOR", "NO05"));
        woeidMap.put("55848082", new Place(
                "Alytaus", "LTU", "LH56"));
        woeidMap.put("55848084", new Place(
                "Kauno", "LTU", "LH57"));
        woeidMap.put("55848078", new Place(
                "Marijampoles", "LTU", "LH59"));
        woeidMap.put("55848087", new Place(
                "Taurages", "LTU", "LH62"));
        woeidMap.put("55848081", new Place(
                "Utenos", "LTU", "LH64"));
        woeidMap.put("55848083", new Place(
                "Vilniaus", "LTU", "LH65"));
        woeidMap.put("20070121", new Place(
                "Riga", "LVA", "LG20"));
        woeidMap.put("20070121", new Place(
                "Riga", "LVA", "LG32"));
        woeidMap.put("2346954", new Place(
                "Ash Sharqiyah", "SAU", "SA06"));
        woeidMap.put("20070010", new Place(
                "Ar Rayyan", "QAT", "QA06"));
        woeidMap.put("20070012", new Place(
                "Al Wakrah", "QAT", "QA05"));
        woeidMap.put("20070011", new Place(
                "Jariyan al Batnah", "QAT", "QA08"));
        woeidMap.put("20070004", new Place(
                "Al Ghuwayriyah", "QAT", "QA02"));
        woeidMap.put("20070006", new Place(
                "Al Khawr", "QAT", "QA04"));
        woeidMap.put("20070007", new Place(
                "Umm Salal", "QAT", "QA09"));
        woeidMap.put("2346500", new Place(
                "Azad Kashmir", "PAK", "PK06"));
        woeidMap.put("2346501", new Place(
                "Northern Areas", "PAK", "PK07"));
        woeidMap.put("2346498", new Place(
                "Punjab", "PAK", "PK04"));
        woeidMap.put("20070195", new Place(
                "Chuy", "KGZ", "KG02"));
        woeidMap.put("2346497", new Place(
                "N.W.F.P.", "PAK", "PK03"));
        woeidMap.put("20070026", new Place(
                "Dhawalagiri", "NPL", "NP03"));
        woeidMap.put("20070018", new Place(
                "Karnali", "NPL", "NP06"));
        woeidMap.put("20070026", new Place(
                "Lumbini", "NPL", "NP08"));
        woeidMap.put("20070030", new Place(
                "Mahakali", "NPL", "NP09"));
        woeidMap.put("20070029", new Place(
                "Janakpur", "NPL", "NP05"));
        woeidMap.put("20070029", new Place(
                "Narayani", "NPL", "NP11"));
        woeidMap.put("20070023", new Place(
                "Sagarmatha", "NPL", "NP13"));
        woeidMap.put("20070023", new Place(
                "Mechi", "NPL", "NP10"));
        woeidMap.put("2345710", new Place(
                "Aceh", "IDN", "ID01"));
        woeidMap.put("2346302", new Place(
                "Perak", "MYS", "MY07"));
        woeidMap.put("2346304", new Place(
                "Pulau Pinang", "MYS", "MY09"));
        woeidMap.put("2346304", new Place(
                "Pulau Pinang", "MYS", "MY09"));
        woeidMap.put("2346297", new Place(
                "Kedah", "MYS", "MY02"));
        woeidMap.put("2346303", new Place(
                "Perlis", "MYS", "MY08"));
        woeidMap.put("2346303", new Place(
                "Perlis", "MYS", "MY08"));
        woeidMap.put("2346296", new Place(
                "Johor", "MYS", "MY01"));
        woeidMap.put("2346298", new Place(
                "Kelantan", "MYS", "MY03"));
        woeidMap.put("2346299", new Place(
                "Melaka", "MYS", "MY04"));
        woeidMap.put("2346300", new Place(
                "Negeri Sembilan", "MYS", "MY05"));
        woeidMap.put("2346301", new Place(
                "Pahang", "MYS", "MY06"));
        woeidMap.put("2346306", new Place(
                "Selangor", "MYS", "MY12"));
        woeidMap.put("12578005", new Place(
                "Gansu", "CHN", "CH15"));
        woeidMap.put("12577996", new Place(
                "Qinghai", "CHN", ""));
        woeidMap.put("12578006", new Place(
                "Guangxi", "CHN", "CH16"));
        woeidMap.put("12578007", new Place(
                "Guizhou", "CHN", "CH18"));
        woeidMap.put("20070171", new Place(
                "Chongqing", "CHN", "CH33"));
        woeidMap.put("12578011", new Place(
                "Beijing", "CHN", "CH22"));
        woeidMap.put("20070334", new Place(
                "Kaohsiung", "TWN", ""));
        woeidMap.put("20070335", new Place(
                "Tainan", "TWN", ""));
        woeidMap.put("20070335", new Place(
                "Hsinchu", "TWN", ""));
        woeidMap.put("20070333", new Place(
                "Taipei", "TWN", "TW03"));
        woeidMap.put("20070335", new Place(
                "Taoyuan", "TWN", ""));
        woeidMap.put("20070335", new Place(
                "Chiayi", "TWN", ""));
        woeidMap.put("20070335", new Place(
                "Taichung", "TWN", ""));
        woeidMap.put("20070335", new Place(
                "Yunlin", "TWN", ""));
        woeidMap.put("12577997", new Place(
                "Fujian", "CHN", "CH07"));
        woeidMap.put("12578022", new Place(
                "Anhui", "CHN", "CH01"));
        woeidMap.put("12578019", new Place(
                "Guangdong", "CHN", "CH30"));
        woeidMap.put("20069849", new Place(
                "Belait", "BRN", "BX01"));
        woeidMap.put("20069846", new Place(
                "Brunei and Muara", "BRN", "BX02"));
        woeidMap.put("20069847", new Place(
                "Temburong", "BRN", "BX03"));
        woeidMap.put("20069848", new Place(
                "Tutong", "BRN", "BX04"));
        woeidMap.put("2345723", new Place(
                "Kalimantan Timur", "IDN", "ID14"));
        woeidMap.put("2346310", new Place(
                "Sabah", "MYS", "MY15"));
        woeidMap.put("2346305", new Place(
                "Sarawak", "MYS", "MY11"));
        woeidMap.put("2346985", new Place(
                "Northern Cape", "ZAF", "SF06"));
        woeidMap.put("2346987", new Place(
                "Western Cape", "ZAF", "SF09"));
        woeidMap.put("2344743", new Place(
                "Ghanzi", "BWA", "BC03"));
        woeidMap.put("2345938", new Place(
                "Coast", "KEN", "KE02"));
        woeidMap.put("2345937", new Place(
                "Central", "KEN", "KE01"));
        woeidMap.put("2345942", new Place(
                "Nyanza", "KEN", "KE07"));
        woeidMap.put("2346311", new Place(
                "Cabo Delgado", "MOZ", "MZ01"));
        woeidMap.put("2346317", new Place(
                "Niassa", "MOZ", "MZ07"));
        woeidMap.put("20069865", new Place(
                "Berea", "LSO", "LT10"));
        woeidMap.put("20069870", new Place(
                "Maseru", "LSO", "LT14"));
        woeidMap.put("20069868", new Place(
                "Mohale 's Hoek	", "	LSO	", "	LT15	"));
        woeidMap.put("2346980", new Place(
                "Orange Free State", "ZAF", "SF07"));
        woeidMap.put("2346312", new Place(
                "Gaza", "MOZ", "MZ02"));
        woeidMap.put("2346981", new Place(
                "Gauteng", "ZAF", "SF08"));
        woeidMap.put("2346983", new Place(
                "Mpumalanga", "ZAF", "SF02"));
        woeidMap.put("2346986", new Place(
                "Limpopo", "ZAF", "SF05"));
        woeidMap.put("20069862", new Place(
                "Butha - Buthe", "LSO", "LT11"));
        woeidMap.put("20069861", new Place(
                "Mokhotlong", "LSO", "LT16"));
        woeidMap.put("20069866", new Place(
                "Qacha 's Nek	", "	LSO	", "	LT17	"));
        woeidMap.put("20069864", new Place(
                "Thaba - Tseka", "LSO", "LT19"));
        woeidMap.put("2346982", new Place(
                "KwaZulu - Natal", "ZAF", "SF03"));
        woeidMap.put("2346150", new Place(
                "Antananarivo", "MDG", "MA05"));
        woeidMap.put("2345715", new Place(
                "Jawa Barat", "IDN", "ID30"));
        woeidMap.put("2345716", new Place(
                "Jawa Tengah", "IDN", "ID07"));
        woeidMap.put("2345712", new Place(
                "Bengkulu", "IDN", "ID03"));
        woeidMap.put("28350158", new Place(
                "Banten", "IDN", "ID33"));
        woeidMap.put("2345713", new Place(
                "Jakarta Raya", "IDN", "ID04"));
        woeidMap.put("2345720", new Place(
                "Kalimantan Barat", "IDN", "ID11"));
        woeidMap.put("2345724", new Place(
                "Lampung", "IDN", "ID15"));
        woeidMap.put("2345734", new Place(
                "Sumatera Selatan", "IDN", "ID32"));
        woeidMap.put("28350154", new Place(
                "Bangka - Belitung", "IDN", "ID35"));
        woeidMap.put("2345711", new Place(
                "Bali", "IDN", "ID02"));
        woeidMap.put("2345717", new Place(
                "Jawa Timur", "IDN", "ID08"));
        woeidMap.put("2345721", new Place(
                "Kalimantan Selatan", "IDN", "ID12"));
        woeidMap.put("2345727", new Place(
                "Nusa Tenggara Timur", "IDN", "ID18"));
        woeidMap.put("2345729", new Place(
                "Sulawesi Selatan", "IDN", "ID38"));
        woeidMap.put("28350155", new Place(
                "Sulawesi Barat", "IDN", "ID41"));
        woeidMap.put("2346599", new Place(
                "Enga", "PNG", "PP19"));
        woeidMap.put("2346591", new Place(
                "East Sepik", "PNG", "PP11"));
        woeidMap.put("2346598", new Place(
                "Sandaun", "PNG", "PP18"));
        woeidMap.put("2346588", new Place(
                "Chimbu", "PNG", "PP08"));
        woeidMap.put("2346589", new Place(
                "Eastern Highlands", "PNG", "PP09"));
        woeidMap.put("2346582", new Place(
                "Gulf", "PNG", "PP02"));
        woeidMap.put("2346587", new Place(
                "North Solomons", "PNG", "PP07"));
        woeidMap.put("2346585", new Place(
                "Southern Highlands", "PNG", "PP05"));
        woeidMap.put("2346596", new Place(
                "Western Highlands", "PNG", "PP16"));
        woeidMap.put("2346581", new Place(
                "Central", "PNG", "PP01"));
        woeidMap.put("2346590", new Place(
                "East New Britain", "PNG", "PP10"));
        woeidMap.put("2346593", new Place(
                "Manus", "PNG", "PP13"));
        woeidMap.put("2346583", new Place(
                "Milne Bay", "PNG", "PP03"));
        woeidMap.put("2346600", new Place(
                "National Capital District", "PNG", ""));
        woeidMap.put("2346595", new Place(
                "New Ireland", "PNG", "PP15"));
        woeidMap.put("2346584", new Place(
                "Northern", "PNG", "PP04"));
        woeidMap.put("2346597", new Place(
                "West New Britain", "PNG", "PP17"));
        woeidMap.put("24549807", new Place(
                "Sud", "NCL", "NC03"));
        woeidMap.put("2344836", new Place(
                "Malaita", "SLB", "BP03"));
        woeidMap.put("2344838", new Place(
                "Rennell and Bellona", "SLB", "BP10"));
        woeidMap.put("2344838", new Place(
                "Central", "SLB", "BP10"));
        woeidMap.put("2344839", new Place(
                "Guadalcanal", "SLB", "BP06"));
        woeidMap.put("2344840", new Place(
                "Isabel", "SLB", "BP07"));
        woeidMap.put("7153329", new Place(
                "Rhône - Alpes", "FRA", "FRB9"));
        woeidMap.put("2345203", new Place(
                "Azuay", "ECU", "EC02"));
        woeidMap.put("2345209", new Place(
                "El Oro", "ECU", "EC08"));
        woeidMap.put("2345221", new Place(
                "Zamora Chinchipe", "ECU", "EC20"));
        woeidMap.put("2344694", new Place(
                "Santa Cruz", "ARG", "AR20"));
        woeidMap.put("2344697", new Place(
                "Tierra del Fuego", "ARG", "AR23"));
        woeidMap.put("2344678", new Place(
                "Chubut", "ARG", "AR04"));
        woeidMap.put("2344689", new Place(
                "Neuquén", "ARG", "AR15"));
        woeidMap.put("2345215", new Place(
                "Bolivar", "ECU", "EC03"));
        woeidMap.put("2345208", new Place(
                "Cotopaxi", "ECU", "EC07"));
        woeidMap.put("2345211", new Place(
                "Guayas", "ECU", "EC10"));
        woeidMap.put("2345214", new Place(
                "Los Rios", "ECU", "EC13"));
        woeidMap.put("2345215", new Place(
                "Manabi", "ECU", "EC14"));
        woeidMap.put("2345047", new Place(
                "Amazonas", "COL", "CO01"));
        woeidMap.put("2345207", new Place(
                "Chimborazo", "ECU", "EC06"));
        woeidMap.put("2345216", new Place(
                "Morona Santiago", "ECU", "EC15"));
        woeidMap.put("20070099", new Place(
                "Orellana", "ECU", "EC24"));
        woeidMap.put("2345219", new Place(
                "Pichincha", "ECU", "EC19"));
        woeidMap.put("2345218", new Place(
                "Pastaza", "ECU", "EC17"));
        woeidMap.put("2345217", new Place(
                "Napo", "ECU", ""));
        woeidMap.put("2345220", new Place(
                "Tungurahua", "ECU", "EC23"));
        woeidMap.put("2344802", new Place(
                "Cochabamba", "BOL", "BL02"));
        woeidMap.put("2344801", new Place(
                "Chuquisaca", "BOL", "BL01"));
        woeidMap.put("2344803", new Place(
                "El Beni", "BOL", "BL03"));
        woeidMap.put("2344681", new Place(
                "Ciudad de Buenos Aires", "ARG", "AR01"));
        woeidMap.put("2344685", new Place(
                "La Pampa", "ARG", "AR11"));
        woeidMap.put("2344684", new Place(
                "Jujuy", "ARG", "AR10"));
        woeidMap.put("2344677", new Place(
                "Chaco", "ARG", "AR03"));
        woeidMap.put("2344688", new Place(
                "Misiones", "ARG", "AR14"));
        woeidMap.put("2344860", new Place(
                "Pernambuco", "BRA", "BR30"));
        woeidMap.put("2345071", new Place(
                "Santander", "COL", "CO26"));
        woeidMap.put("2345062", new Place(
                "La Guajira", "COL", "CO17"));
        woeidMap.put("2345109", new Place(
                "Isla de la Juventud", "CUB", "CU04"));
        woeidMap.put("2345083", new Place(
                "Cartago", "CRI", "CS02"));
        woeidMap.put("2345085", new Place(
                "Heredia", "CRI", "CS04"));
        woeidMap.put("2345086", new Place(
                "Limón", "CRI", "CS06"));
        woeidMap.put("2345087", new Place(
                "Puntarenas", "CRI", "CS07"));
        woeidMap.put("2346552", new Place(
                "Chiriquí", "PAN", "PM02"));
        woeidMap.put("2345084", new Place(
                "Guanacaste", "CRI", "CS03"));
        woeidMap.put("2346553", new Place(
                "Coclé", "PAN", "PM03"));
        woeidMap.put("2346554", new Place(
                "Colón", "PAN", "PM04"));
        woeidMap.put("2346556", new Place(
                "Herrera", "PAN", "PM06"));
        woeidMap.put("2347586", new Place(
                "Panama", "PAN", "PM08"));
        woeidMap.put("2346560", new Place(
                "Veraguas", "PAN", "PM10"));
        woeidMap.put("2345070", new Place(
                "San Andrés y Providencia", "COL", "CO17"));
        woeidMap.put("2345293", new Place(
                "Cabañas", "SLV", "ES02"));
        woeidMap.put("2345295", new Place(
                "Cuscatlán", "SLV", "ES04"));
        woeidMap.put("2345297", new Place(
                "La Paz", "SLV", "ES06"));
        woeidMap.put("2345299", new Place(
                "Morazán", "SLV", "ES08"));
        woeidMap.put("2344799", new Place(
                "Toledo", "BLZ", "BH06"));
        woeidMap.put("2345621", new Place(
                "Sud", "HTI", "HA12"));
        woeidMap.put("2345113", new Place(
                "Granma", "CUB", "CU09"));
        woeidMap.put("2345912", new Place(
                "Clarendon", "JAM", "JM01"));
        woeidMap.put("2345913", new Place(
                "Hanover", "JAM", "JM02"));
        woeidMap.put("2345914", new Place(
                "Manchester", "JAM", "JM04"));
        woeidMap.put("2345919", new Place(
                "Saint Elizabeth", "JAM", "JM11"));
        woeidMap.put("2345920", new Place(
                "Saint James", "JAM", "JM12"));
        woeidMap.put("2345923", new Place(
                "Trelawny", "JAM", "JM15"));
        woeidMap.put("2345924", new Place(
                "Westmoreland", "JAM", "JM16"));
        woeidMap.put("2345915", new Place(
                "Portland", "JAM", "JM07"));
        woeidMap.put("2345917", new Place(
                "Saint Ann", "JAM", "JM09"));
        woeidMap.put("2345921", new Place(
                "Saint Mary", "JAM", "JM13"));
        woeidMap.put("2345916", new Place(
                "Saint Andrew", "JAM", "JM08"));
        woeidMap.put("2345922", new Place(
                "Saint Thomas", "JAM", "JM14"));
        woeidMap.put("2345615", new Place(
                "L 'Artibonite	", "	HTI	", "	HA06	"));
        woeidMap.put("2345618", new Place(
                "Nord", "HTI", "HA09"));
        woeidMap.put("2345620", new Place(
                "Ouest", "HTI", "HA11"));
        woeidMap.put("28358196", new Place(
                "Santo Domingo", "DOM", "DR00"));
        woeidMap.put("2345053", new Place(
                "Caldas", "COL", "CO37"));
        woeidMap.put("2345078", new Place(
                "Cundinamarca", "COL", ""));
        woeidMap.put("2345069", new Place(
                "Risaralda", "COL", "CO24"));
        woeidMap.put("2345073", new Place(
                "Tolima", "COL", "CO28"));
        woeidMap.put("2345055", new Place(
                "Cauca", "COL", "CO09"));
        woeidMap.put("2345061", new Place(
                "Huila", "COL", "CO16"));
        woeidMap.put("2345067", new Place(
                "Putumayo", "COL", "CO22"));
        woeidMap.put("2345074", new Place(
                "Valle del Cauca", "COL", "CO11"));
        woeidMap.put("2345206", new Place(
                "Carchi", "ECU", "EC05"));
        woeidMap.put("2345212", new Place(
                "Imbabura", "ECU", "EC11"));
        woeidMap.put("2345222", new Place(
                "Sucumbios", "ECU", "EC22"));
        woeidMap.put("2345056", new Place(
                "Cesar", "COL", "CO10"));
        woeidMap.put("2345063", new Place(
                "Magdalena", "COL", "CO18"));
        woeidMap.put("2346555", new Place(
                "Darién", "PAN", "PM05"));
        woeidMap.put("2346559", new Place(
                "Kuna Yala", "PAN", "PM09"));
        woeidMap.put("2345066", new Place(
                "Norte de Santander", "COL", "CO21"));
        woeidMap.put("2345077", new Place(
                "Casanare", "COL", "CO32"));
        woeidMap.put("2345064", new Place(
                "Meta", "COL", "CO19"));
        woeidMap.put("2345076", new Place(
                "Vichada", "COL", "CO31"));
        woeidMap.put("2345107", new Place(
                "Ciudad de la Habana", "CUB", "CU02"));
        woeidMap.put("2345115", new Place(
                "La Habana", "CUB", "CU11"));
        woeidMap.put("2345120", new Place(
                "Villa Clara", "CUB", "CU16"));
        woeidMap.put("2345161", new Place(
                "Saint Andrew", "DMA", "DO02"));
        woeidMap.put("2345162", new Place(
                "Saint David", "DMA", "DO03"));
        woeidMap.put("2345163", new Place(
                "Saint George", "DMA", "DO04"));
        woeidMap.put("2345164", new Place(
                "Saint John", "DMA", "DO05"));
        woeidMap.put("2345166", new Place(
                "Saint Luke", "DMA", "DO07"));
        woeidMap.put("2345167", new Place(
                "Saint Mark", "DMA", "DO08"));
        woeidMap.put("2345168", new Place(
                "Saint Patrick", "DMA", "DO09"));
        woeidMap.put("2345169", new Place(
                "Saint Paul", "DMA", "DO10"));
        woeidMap.put("2345170", new Place(
                "Saint Peter", "DMA", "DO11"));
        woeidMap.put("2347594", new Place(
                "Eysturoyar", "FRO", "FO00"));
        woeidMap.put("2345271", new Place(
                "Waterford", "IRL", "EI32"));
        woeidMap.put("2345105", new Place(
                "Bangui", "CAF", "CT10"));
        woeidMap.put("2344947", new Place(
                "Bet", "TCD", "CD03"));
        woeidMap.put("56013481", new Place(
                "Hadjer - Lamis", "TCD", "CD04"));
        woeidMap.put("2344950", new Place(
                "Kanem", "TCD", "CD06"));
        woeidMap.put("2344951", new Place(
                "Lac", "TCD", "CD07"));
        woeidMap.put("20069850", new Place(
                "Centro Sur", "GNQ", "EK06"));
        woeidMap.put("20069853", new Place(
                "Litoral", "GNQ", "EK08"));
        woeidMap.put("2344945", new Place(
                "Batha", "TCD", "CD01"));
        woeidMap.put("2344949", new Place(
                "Guéra", "TCD", "CD05"));
        woeidMap.put("2345034", new Place(
                "Littoral", "CMR", "CM05"));
        woeidMap.put("20069855", new Place(
                "Bioko Norte", "GNQ", "EK05"));
        woeidMap.put("20069856", new Place(
                "Bioko Sur", "GNQ", "EK04"));
        woeidMap.put("2345038", new Place(
                "Adamaoua", "CMR", "CM10"));
        woeidMap.put("2345041", new Place(
                "Nord", "CMR", "CM13"));
        woeidMap.put("2344952", new Place(
                "Logone Occidental", "TCD", "CD08"));
        woeidMap.put("2344953", new Place(
                "Logone Oriental", "TCD", "CD09"));
        woeidMap.put("56013483", new Place(
                "Mayo - Kebbi Est", "TCD", "CD10"));
        woeidMap.put("56013482", new Place(
                "Mandoul", "TCD", "CD11"));
        woeidMap.put("2344957", new Place(
                "Salamat", "TCD", "CD13"));
        woeidMap.put("12577973", new Place(
                "Dubrovacko - Neretvanska", "HRV", "HR03"));
        woeidMap.put("12577985", new Place(
                "Splitsko - Dalmatinska", "HRV", "HR15"));
        woeidMap.put("12577989", new Place(
                "Zadarska", "HRV", "HR19"));
        woeidMap.put("29389244", new Place(
                "Bar", "MNE", "AL49"));
        woeidMap.put("29389563", new Place(
                "Shkodër", "ALB", "AL49"));
        woeidMap.put("29389243", new Place(
                "Budva", "MNE", "MJ00"));
        woeidMap.put("29389565", new Place(
                "Vlorë", "ALB", "AL51"));
        woeidMap.put("29389214", new Place(
                "Zlatiborski", "SRB", "BK00"));
        woeidMap.put("29389240", new Place(
                "Kotor", "MNE", "HR03"));
        woeidMap.put("29389233", new Place(
                "Andrijevica", "MNE", "MJ00"));
        woeidMap.put("29389236", new Place(
                "Danilovgrad", "MNE", "MJ00"));
        woeidMap.put("29389201", new Place(
                "Gnjilane", "KO -", "MK20"));
        woeidMap.put("29389554", new Place(
                "Berat", "ALB", "AL40"));
        woeidMap.put("29389557", new Place(
                "Elbasan", "ALB", "AL43"));
        woeidMap.put("29389201", new Place(
                "Prizren", "KO -", "MKA6"));
        woeidMap.put("2345227", new Place(
                "Al Gharbiyah", "EGY", "EG05"));
        woeidMap.put("2345231", new Place(
                "Al Minufiyah", "EGY", "EG09"));
        woeidMap.put("2345223", new Place(
                "Ad Daqahliyah", "EGY", "EG01"));
        woeidMap.put("2345225", new Place(
                "Al Buhayrah", "EGY", "EG03"));
        woeidMap.put("2347594", new Place(
                "Al Wadi at Jadid", "EGY", "EG13"));
        woeidMap.put("20070209", new Place(
                "Aragatsotn", "ARM", "AM01"));
        woeidMap.put("20070210", new Place(
                "Armavir", "ARM", "AM03"));
        woeidMap.put("20070203", new Place(
                "Shirak", "ARM", "AM07"));
        woeidMap.put("2345224", new Place(
                "Al Bahr al Ahmar", "EGY", "EG02"));
        woeidMap.put("2345247", new Place(
                "Janub Sina '	", "	EGY	", "	EG26	"));
        woeidMap.put("2345248", new Place(
                "Shamal Sina '	", "	EGY	", "	EG32	"));
        woeidMap.put("2344985", new Place(
                "Orientale", "COD", "CG09"));
        woeidMap.put("24549686", new Place(
                "Gash Barka", "ERI", "ER04"));
        woeidMap.put("24549686", new Place(
                "Anseba", "ERI", "ER05"));
        woeidMap.put("24549683", new Place(
                "Debub", "ERI", "ER06"));
        woeidMap.put("24549686", new Place(
                "Semenawi Keyih Bahri", "ERI", "ER01"));
        woeidMap.put("24549686", new Place(
                "Maekel", "ERI", "ER02"));
        woeidMap.put("2345487", new Place(
                "Nordrhein - Westfalen", "DEU", "GM07"));
        woeidMap.put("2345481", new Place(
                "Baden - Württemberg", "DEU", "GM01"));
        woeidMap.put("2345485", new Place(
                "Hessen", "DEU", "GM05"));
        woeidMap.put("2345483", new Place(
                "Bremen", "DEU", "GM03"));
        woeidMap.put("2345486", new Place(
                "Niedersachsen", "DEU", "GM06"));
        woeidMap.put("2345495", new Place(
                "Thüringen", "DEU", "GM15"));
        woeidMap.put("2345484", new Place(
                "Hamburg", "DEU", "GM04"));
        woeidMap.put("2345488", new Place(
                "Rheinland - Pfalz", "DEU", "GM08"));
        woeidMap.put("2345489", new Place(
                "Saarland", "DEU", "GM09"));
        woeidMap.put("12577977", new Place(
                "Krapinsko - Zagorska", "HRV", "SI92"));
        woeidMap.put("12577990", new Place(
                "Karlovacka", "HRV", "HR05"));
        woeidMap.put("12577978", new Place(
                "Licko - Senjska", "HRV", "HR08"));
        woeidMap.put("12577982", new Place(
                "Primorsko - Goranska", "HRV", "HR12"));
        woeidMap.put("12577982", new Place(
                "Primorsko - Goranska", "HRV", "HR12"));
        woeidMap.put("12577983", new Place(
                "Zagrebacka", "HRV", "HR20"));
        woeidMap.put("20070170", new Place(
                "Grad Zagreb", "HRV", "HR21"));
        woeidMap.put("20070500", new Place(
                "Karlovarský", "CZE", "EZ09"));
        woeidMap.put("2345482", new Place(
                "Bayern", "DEU", "GM02"));
        woeidMap.put("12577974", new Place(
                "Istarska", "HRV", "HR04"));
        woeidMap.put("20070498", new Place(
                "Liberecký", "CZE", "EZ03"));
        woeidMap.put("20070466", new Place(
                "Královéhradecký", "CZE", "EZ07"));
        woeidMap.put("2345493", new Place(
                "Sachsen", "DEU", "GM13"));
        woeidMap.put("12577972", new Place(
                "Brodsko - Posavska", "HRV", "HR02"));
        woeidMap.put("12577972", new Place(
                "Brodsko - Posavska", "HRV", "HR11"));
        woeidMap.put("12577988", new Place(
                "Vukovarsko - Srijemska", "HRV", "HR18"));
        woeidMap.put("12577987", new Place(
                "Viroviticko - Podravska", "HRV", "HR17"));
        woeidMap.put("12577979", new Place(
                "Medimurska", "HRV", "HR09"));
        woeidMap.put("20070170", new Place(
                "Grad Zagreb", "HRV", "HR20"));
        woeidMap.put("20070471", new Place(
                "Moravskoslezský", "CZE", "PL04"));
        woeidMap.put("55948180", new Place(
                "Briceni", "MDA", "MD63"));
        woeidMap.put("55948186", new Place(
                "Donduseni", "MDA", "MD70"));
        woeidMap.put("55948195", new Place(
                "Ocnita", "MDA", "MD81"));
        woeidMap.put("20069873", new Place(
                "Balti", "MDA", "MD60"));
        woeidMap.put("55948187", new Place(
                "Drochia", "MDA", "MD71"));
        woeidMap.put("55948188", new Place(
                "Falesti", "MDA", "MD74"));
        woeidMap.put("55948190", new Place(
                "Glodeni", "MDA", "MD76"));
        woeidMap.put("20069874", new Place(
                "Ungheni", "MDA", "MD92"));
        woeidMap.put("20069882", new Place(
                "Cahul", "MDA", "MD51"));
        woeidMap.put("55948203", new Place(
                "Taraclia", "MDA", "MD51"));
        woeidMap.put("20069881", new Place(
                "Gagauzia", "MDA", "MD51"));
        woeidMap.put("20069878", new Place(
                "Chisinau", "MDA", "MD57"));
        woeidMap.put("20069876", new Place(
                "Dubasari", "MDA", "MD58"));
        woeidMap.put("55948205", new Place(
                "Anenii Noi", "MDA", "MD59"));
        woeidMap.put("55948179", new Place(
                "Basarabeasca", "MDA", "MD61"));
        woeidMap.put("55948182", new Place(
                "Cantemir", "MDA", "MD65"));
        woeidMap.put("55948181", new Place(
                "Calarasi", "MDA", "MD66"));
        woeidMap.put("55948184", new Place(
                "Cimislia", "MDA", "MD68"));
        woeidMap.put("55948185", new Place(
                "Criuleni", "MDA", "MD69"));
        woeidMap.put("55948189", new Place(
                "Floresti", "MDA", "MD75"));
        woeidMap.put("20069876", new Place(
                "Transnistria", "MDA", "MD72"));
        woeidMap.put("55948194", new Place(
                "Nisporeni", "MDA", "MD80"));
        woeidMap.put("20069875", new Place(
                "Orhei", "MDA", "MD82"));
        woeidMap.put("55948196", new Place(
                "Rezina", "MDA", "MD83"));
        woeidMap.put("55948196", new Place(
                "Rezina", "MDA", "MD83"));
        woeidMap.put("55948199", new Place(
                "Soldanesti", "MDA", "MD86"));
        woeidMap.put("55948202", new Place(
                "Straseni", "MDA", "MD87"));
        woeidMap.put("55948204", new Place(
                "Telenesti", "MDA", "MD91"));
        woeidMap.put("55948183", new Place(
                "Causeni", "MDA", "MD67"));
        woeidMap.put("55948200", new Place(
                "Stefan Voda", "MDA", "MD88"));
        woeidMap.put("20069872", new Place(
                "Soroca", "MDA", "MD87"));
        woeidMap.put("2345276", new Place(
                "Harju", "EST", "EN01"));
        woeidMap.put("2345278", new Place(
                "Ida - Viru", "EST", "EN03"));
        woeidMap.put("2345279", new Place(
                "Järva", "EST", "EN04"));
        woeidMap.put("2345280", new Place(
                "Jõgeva", "EST", "EN05"));
        woeidMap.put("2345282", new Place(
                "Lääne - Viru", "EST", "EN08"));
        woeidMap.put("2345277", new Place(
                "Hiiu", "EST", "EN02"));
        woeidMap.put("2345281", new Place(
                "Lääne", "EST", "EN07"));
        woeidMap.put("12578004", new Place(
                "Xizang", "CHN", "CH14"));
        woeidMap.put("20070169", new Place(
                "Al Asimah", "KWT", "KU02"));
        woeidMap.put("20070166", new Place(
                "Al Ahmadi", "KWT", "KU04"));
        woeidMap.put("55943079", new Place(
                "Mubarak Al - Kabeer", "KWT", ""));
        woeidMap.put("20070165", new Place(
                "Al Jahrah", "KWT", "KU05"));
        woeidMap.put("20070202", new Place(
                "Tavush", "ARM", "AJ40"));
        woeidMap.put("20070211", new Place(
                "Ararat", "ARM", "AM02"));
        woeidMap.put("2347594", new Place(
                "Gegharkunik", "ARM", "AM04"));
        woeidMap.put("20070208", new Place(
                "Kotayk", "ARM", "AM05"));
        woeidMap.put("20070269", new Place(
                "Samux", "AZE", "AJ52"));
        woeidMap.put("20070252", new Place(
                "Yevlax", "AZE", "AJ67"));
        woeidMap.put("20070206", new Place(
                "Syunik", "ARM", "AM08"));
        woeidMap.put("20070205", new Place(
                "Vayots Dzor", "ARM", "AM10"));
        woeidMap.put("20070265", new Place(
                "Susa", "AZE", "AJ55"));
        woeidMap.put("2344550", new Place(
                "Badghis", "AFG", "AF02"));
        woeidMap.put("2344558", new Place(
                "Hirat", "AFG", "AF11"));
        woeidMap.put("2344552", new Place(
                "Bamyan", "AFG", "AF05"));
        woeidMap.put("2344554", new Place(
                "Faryab", "AFG", "AF07"));
        woeidMap.put("2344576", new Place(
                "Jawzjan", "AFG", "AF31"));
        woeidMap.put("2344556", new Place(
                "Ghor", "AFG", "AF09"));
        woeidMap.put("2344578", new Place(
                "Sari Pul", "AFG", "AF33"));
        woeidMap.put("2344553", new Place(
                "Farah", "AFG", "AF06"));
        woeidMap.put("2344557", new Place(
                "Hilmand", "AFG", "AF10"));
        woeidMap.put("2344565", new Place(
                "Nimroz", "AFG", "AF19"));
        woeidMap.put("2344566", new Place(
                "Uruzgan", "AFG", "AF39"));
        woeidMap.put("2344566", new Place(
                "Uruzgan", "AFG", "AF41"));
        woeidMap.put("2344569", new Place(
                "Kandahar", "AFG", "AF23"));
        woeidMap.put("2344573", new Place(
                "Zabul", "AFG", "AF28"));
        woeidMap.put("12578003", new Place(
                "Xinjiang Uygur", "CHN", "CH13"));
        woeidMap.put("2344574", new Place(
                "Paktika", "AFG", "AF29"));
        woeidMap.put("2344549", new Place(
                "Badakhshan", "AFG", "AF01"));
        woeidMap.put("2344561", new Place(
                "Kunar", "AFG", "AF34"));
        woeidMap.put("2344564", new Place(
                "Nangarhar", "AFG", "AF18"));
        woeidMap.put("2344571", new Place(
                "Takhar", "AFG", "AF26"));
        woeidMap.put("2344551", new Place(
                "Baghlan", "AFG", "AF03"));
        woeidMap.put("2344559", new Place(
                "Kabul", "AFG", "AF13"));
        woeidMap.put("2344560", new Place(
                "Kapisa", "AFG", "AF14"));
        woeidMap.put("2344568", new Place(
                "Parwan", "AFG", "AF42"));
        woeidMap.put("2344562", new Place(
                "Laghman", "AFG", "AF35"));
        woeidMap.put("2344563", new Place(
                "Logar", "AFG", "AF17"));
        woeidMap.put("2344568", new Place(
                "Parwan", "AFG", "AF40"));
        woeidMap.put("2344577", new Place(
                "Samangan", "AFG", "AF32"));
        woeidMap.put("12578020", new Place(
                "Hainan", "CHN", "CH31"));
        woeidMap.put("2345867", new Place(
                "Qu ? ng Ninh", "VNM", "VM30"));
        woeidMap.put("20070093", new Place(
                "Bântéay Méanchey", "KHM", "CB25"));
        woeidMap.put("20070094", new Place(
                "Kaôh Kong", "KHM", "CB08"));
        woeidMap.put("2344937", new Place(
                "Pouthisat", "KHM", "CB12"));
        woeidMap.put("2344941", new Place(
                "Siemréab", "KHM", "CB24"));
        woeidMap.put("20070095", new Place(
                "Otdar Mean Chey", "KHM", "CB27"));
        woeidMap.put("20070097", new Place(
                "Krong Pailin", "KHM", "CB30"));
        woeidMap.put("20070094", new Place(
                "Kâmpóng Chhnang", "KHM", "CB03"));
        woeidMap.put("20070094", new Place(
                "Kândal", "KHM", "CB07"));
        woeidMap.put("2344935", new Place(
                "Krâchéh", "KHM", "CB09"));
        woeidMap.put("2344940", new Place(
                "Rôtânôkiri", "KHM", "CB23"));
        woeidMap.put("55949082", new Place(
                "Kepulauan Riau", "IDN", "ID40"));
        woeidMap.put("20070096", new Place(
                "Krong Preah Sihanouk", "KHM", "CB28"));
        woeidMap.put("20070096", new Place(
                "Krong Preah Sihanouk", "KHM", "CB28"));
        woeidMap.put("12578015", new Place(
                "Shaanxi", "CHN", "CH26"));
        woeidMap.put("12578013", new Place(
                "Shanxi", "CHN", "CH24"));
        woeidMap.put("12578002", new Place(
                "Hubei", "CHN", "CH12"));
        woeidMap.put("12578001", new Place(
                "Hunan", "CHN", "CH11"));
        woeidMap.put("12578016", new Place(
                "Sichuan", "CHN", "CH32"));
        woeidMap.put("12578018", new Place(
                "Yunnan", "CHN", "CH29"));
        woeidMap.put("12578000", new Place(
                "Hebei", "CHN", "CH10"));
        woeidMap.put("12577999", new Place(
                "Henan", "CHN", "CH09"));
        woeidMap.put("12578008", new Place(
                "Liaoning", "CHN", "CH19"));
        woeidMap.put("12578014", new Place(
                "Shandong", "CHN", "CH25"));
        woeidMap.put("12578017", new Place(
                "Tianjin", "CHN", "CH22"));
        woeidMap.put("12578017", new Place(
                "Tianjin", "CHN", "CH28"));
        woeidMap.put("12577993", new Place(
                "Jiangxi", "CHN", "CH03"));
        woeidMap.put("12577994", new Place(
                "Jiangsu", "CHN", "CH04"));
        woeidMap.put("12578012", new Place(
                "Shanghai", "CHN", "CH23"));
        woeidMap.put("12577992", new Place(
                "Zhejiang", "CHN", "CH02"));
        woeidMap.put("2345861", new Place(
                "Hiroshima", "JPN", "JA11"));
        woeidMap.put("2345880", new Place(
                "Okayama", "JPN", "JA31"));
        woeidMap.put("2345856", new Place(
                "Fukui", "JPN", "JA36"));
        woeidMap.put("2345885", new Place(
                "Shimane", "JPN", "JA36"));
        woeidMap.put("2345890", new Place(
                "Tottori", "JPN", "JA41"));
        woeidMap.put("2345894", new Place(
                "Yamaguchi", "JPN", "JA45"));
        woeidMap.put("2345882", new Place(
                "Saga", "JPN", "JA33"));
        woeidMap.put("12577995", new Place(
                "Jilin", "CHN", "CH05"));
        woeidMap.put("58646425", new Place(
                "Fukuoka", "JPN", "JA07"));
        woeidMap.put("2345870", new Place(
                "Kumamoto", "JPN", "JA21"));
        woeidMap.put("2345874", new Place(
                "Miyazaki", "JPN", "JA25"));
        woeidMap.put("2345855", new Place(
                "Ehime", "JPN", "JA05"));
        woeidMap.put("2345866", new Place(
                "Kagawa", "JPN", "JA17"));
        woeidMap.put("2345869", new Place(
                "Kochi", "JPN", "JA20"));
        woeidMap.put("2345879", new Place(
                "Oita", "JPN", "JA30"));
        woeidMap.put("2345888", new Place(
                "Tokushima", "JPN", "JA39"));
        woeidMap.put("12578009", new Place(
                "Nei Mongol", "CHN", "CH20"));
        woeidMap.put("12577998", new Place(
                "Heilongjiang", "CHN", "CH08"));
        woeidMap.put("2345851", new Place(
                "Aichi", "JPN", "JA01"));
        woeidMap.put("2345859", new Place(
                "Gifu", "JPN", "JA09"));
        woeidMap.put("2345864", new Place(
                "Ishikawa", "JPN", "JA15"));
        woeidMap.put("2345872", new Place(
                "Mie", "JPN", "JA23"));
        woeidMap.put("2345875", new Place(
                "Nagano", "JPN", "JA26"));
        woeidMap.put("2345886", new Place(
                "Shizuoka", "JPN", "JA37"));
        woeidMap.put("2345891", new Place(
                "Toyama", "JPN", "JA42"));
        woeidMap.put("7153351", new Place(
                "Hokkaido", "JPN", "JA12"));
        woeidMap.put("2345856", new Place(
                "Fukui", "JPN", "JA06"));
        woeidMap.put("2345862", new Place(
                "Hyogo", "JPN", "JA13"));
        woeidMap.put("2345871", new Place(
                "Kyoto", "JPN", "JA22"));
        woeidMap.put("2345877", new Place(
                "Nara", "JPN", "JA28"));
        woeidMap.put("2345881", new Place(
                "Osaka", "JPN", "JA32"));
        woeidMap.put("2345884", new Place(
                "Shiga", "JPN", "JA35"));
        woeidMap.put("2345892", new Place(
                "Wakayama", "JPN", "JA43"));
        woeidMap.put("2345854", new Place(
                "Chiba", "JPN", "JA04"));
        woeidMap.put("2345863", new Place(
                "Ibaraki", "JPN", "JA14"));
        woeidMap.put("2345868", new Place(
                "Kanagawa", "JPN", "JA19"));
        woeidMap.put("2345883", new Place(
                "Saitama", "JPN", "JA34"));
        woeidMap.put("2345887", new Place(
                "Tochigi", "JPN", "JA38"));
        woeidMap.put("2345889", new Place(
                "Tokyo", "JPN", "JA40"));
        woeidMap.put("2345895", new Place(
                "Yamanashi", "JPN", "JA46"));
        woeidMap.put("2345852", new Place(
                "Akita", "JPN", "JA02"));
        woeidMap.put("2345853", new Place(
                "Aomori", "JPN", "JA03"));
        woeidMap.put("2345858", new Place(
                "Fukushima", "JPN", "JA08"));
        woeidMap.put("2345865", new Place(
                "Iwate", "JPN", "JA16"));
        woeidMap.put("2345873", new Place(
                "Miyagi", "JPN", "JA24"));
        woeidMap.put("2345878", new Place(
                "Niigata", "JPN", "JA29"));
        woeidMap.put("2345893", new Place(
                "Yamagata", "JPN", "JA44"));
        woeidMap.put("2344671", new Place(
                "Lunda Norte", "AGO", "AO17"));
        woeidMap.put("2344672", new Place(
                "Lunda Sul", "AGO", "AO18"));
        woeidMap.put("2344673", new Place(
                "Bengo", "AGO", "AO19"));
        woeidMap.put("2344660", new Place(
                "Cuanza Norte", "AGO", "AO05"));
        woeidMap.put("2344661", new Place(
                "Cuanza Sul", "AGO", "AO06"));
        woeidMap.put("2344670", new Place(
                "Zaire", "AGO", "AO16"));
        woeidMap.put("2344984", new Place(
                "Bas - Congo", "COD", "CG08"));
        woeidMap.put("2344659", new Place(
                "Cuando Cubango", "AGO", "AO04"));
        woeidMap.put("2344662", new Place(
                "Cunene", "AGO", "AO07"));
        woeidMap.put("2347594", new Place(
                "Huíla", "AGO", "AO09"));
        woeidMap.put("2344668", new Place(
                "Moxico", "AGO", "AO14"));
        woeidMap.put("20069829", new Place(
                "Sud - Kivu", "COD", "CG12"));
        woeidMap.put("20069831", new Place(
                "Maniema", "COD", ""));
        woeidMap.put("2344985", new Place(
                "Kasaï - Oriental", "COD", "CG04"));
        woeidMap.put("20069830", new Place(
                "Nord - Kivu", "COD", "CG11"));
        woeidMap.put("2346315", new Place(
                "Sofala", "MOZ", "MZ05"));
        woeidMap.put("2346319", new Place(
                "Zambezia", "MOZ", "MZ09"));
        woeidMap.put("2346979", new Place(
                "Eastern Cape", "ZAF", "SF01"));
        woeidMap.put("2345714", new Place(
                "Jambi", "IDN", "ID05"));
        woeidMap.put("2345722", new Place(
                "Kalimantan Tengah", "IDN", "ID13"));
        woeidMap.put("2345718", new Place(
                "Irian Jaya Barat", "IDN", "ID39"));
        woeidMap.put("20069919", new Place(
                "Temotu", "SLB", "BP09"));
        woeidMap.put("2344804", new Place(
                "La Paz", "BOL", "BL04"));
        woeidMap.put("2344805", new Place(
                "Oruro", "BOL", "BL05"));
        woeidMap.put("2344806", new Place(
                "Pando", "BOL", "BL06"));
        woeidMap.put("2344807", new Place(
                "Potosí", "BOL", "BL07"));
        woeidMap.put("2344808", new Place(
                "Santa Cruz", "BOL", "BL08"));
        woeidMap.put("2344809", new Place(
                "Tarija", "BOL", "BL09"));
        woeidMap.put("2345553", new Place(
                "Baja Verapaz", "GTM", "GT02"));
        woeidMap.put("2345552", new Place(
                "Alta Verapaz", "GTM", "GT01"));
        woeidMap.put("2345556", new Place(
                "El Progreso", "GTM", "GT05"));
        woeidMap.put("2345569", new Place(
                "Santa Rosa", "GTM", "GT18"));
        woeidMap.put("2345560", new Place(
                "Izabal", "GTM", "GT09"));
        woeidMap.put("2345173", new Place(
                "Bahoruco", "DOM", "DR02"));
        woeidMap.put("2345179", new Place(
                "Independencia", "DOM", "DR"));
        woeidMap.put("2345177", new Place(
                "Duarte", "DOM", "DR06"));
        woeidMap.put("2345176", new Place(
                "Distrito Nacional", "DOM", "DR34"));
        woeidMap.put("2345196", new Place(
                "El Seybo", "DOM", "DR28"));
        woeidMap.put("2345180", new Place(
                "La Altagracia", "DOM", "DR10"));
        woeidMap.put("2344730", new Place(
                "Christ Church", "BRB", "BB01"));
        woeidMap.put("2344731", new Place(
                "Saint Andrew", "BRB", "BB02"));
        woeidMap.put("2344732", new Place(
                "Saint George", "BRB", "BB03"));
        woeidMap.put("2344733", new Place(
                "Saint James", "BRB", "BB04"));
        woeidMap.put("2344734", new Place(
                "Saint John", "BRB", "BB05"));
        woeidMap.put("2344735", new Place(
                "Saint Joseph", "BRB", "BB06"));
        woeidMap.put("2344736", new Place(
                "Saint Lucy", "BRB", "BB07"));
        woeidMap.put("2344737", new Place(
                "Saint Michael", "BRB", "BB08"));
        woeidMap.put("2344738", new Place(
                "Saint Peter", "BRB", "BB09"));
        woeidMap.put("2344739", new Place(
                "Saint Philip", "BRB", "BB10"));
        woeidMap.put("2344740", new Place(
                "Saint Thomas", "BRB", "BB11"));
        woeidMap.put("12578048", new Place(
                "Perthshire and Kinross", "GBR", "UK88"));
        woeidMap.put("12578048", new Place(
                "Fife", "GBR", "UK84"));
        woeidMap.put("24554868", new Place(
                "Northumberland", "GBR", "UK32"));
        woeidMap.put("24554868", new Place(
                "Hampshire", "GBR", "UK19"));
        woeidMap.put("24554868", new Place(
                "West Midlands", "GBR", "UK43"));
        woeidMap.put("24554868", new Place(
                "Gloucestershire", "GBR", "UK16"));
        woeidMap.put("24554868", new Place(
                "Buckinghamshire", "GBR", "UK04"));
        woeidMap.put("24554868", new Place(
                "Bedfordshire", "GBR", "UK02"));
        woeidMap.put("24554868", new Place(
                "Hertfordshire", "GBR", "UK21"));
        woeidMap.put("24554868", new Place(
                "Somerset", "GBR", "UK36"));
        woeidMap.put("24554868", new Place(
                "Devon", "GBR", "UK11"));
        woeidMap.put("24554868", new Place(
                "Berkshire", "GBR", "UK03"));
        woeidMap.put("24554868", new Place(
                "Dorset", "GBR", "UK12"));
        woeidMap.put("24554868", new Place(
                "Cambridgeshire", "GBR", "UK05"));
        woeidMap.put("24554868", new Place(
                "England", "GBR", "UK26"));
        woeidMap.put("24554868", new Place(
                "Derbyshire", "GBR", "UK10"));
        woeidMap.put("24554868", new Place(
                "Lincolnshire", "GBR", "UK32"));
        woeidMap.put("20070563", new Place(
                "Down", "GBR", "UK64"));
        woeidMap.put("12578049", new Place(
                "Carmarthenshire", "GBR", "UK91"));
        woeidMap.put("12578049", new Place(
                "Ceredigion", "GBR", "UK91"));
        woeidMap.put("12578049", new Place(
                "Pembrokeshire", "GBR", "UK91"));
        woeidMap.put("24554868", new Place(
                "Merseyside", "GBR", "UK28"));
        woeidMap.put("24554868", new Place(
                "Cheshire", "GBR", "UK06"));
        woeidMap.put("24554868", new Place(
                "Cornwall", "GBR", "UK08"));
        woeidMap.put("12578049", new Place(
                "Powys", "GBR", "UK95"));
        woeidMap.put("12578049", new Place(
                "Vale of Glamorgan", "GBR", "UK96"));
        woeidMap.put("12578049", new Place(
                "Neath Port Talbot", "GBR", "UK97"));
        woeidMap.put("24554868", new Place(
                "Lancashire", "GBR", "UK25"));
        woeidMap.put("12578049", new Place(
                "Denbighshire", "GBR", "UK90"));
        woeidMap.put("12578049", new Place(
                "Flintshire", "GBR", "UK90"));
        woeidMap.put("12578049", new Place(
                "Anglesey", "GBR", "UK93"));
        woeidMap.put("12578049", new Place(
                "Gwynedd", "GBR", "UK93"));
        woeidMap.put("12578049", new Place(
                "Blaenau Gwent", "GBR", "UK92"));
        woeidMap.put("12578049", new Place(
                "Monmouthshire", "GBR", "UK92"));
        woeidMap.put("12578049", new Place(
                "Torfaen", "GBR", "UK92"));
        woeidMap.put("20070563", new Place(
                "Fermanagh", "GBR", "UK66"));
        woeidMap.put("12578048", new Place(
                "Dumfries and Galloway", "GBR", "UK80"));
        woeidMap.put("24554868", new Place(
                "Cumbria", "GBR", "UK09"));
        woeidMap.put("24554868", new Place(
                "North Yorkshire", "GBR", "UK30"));
        woeidMap.put("2347607", new Place(
                "Aïn Témouchent", "DZA", "AG36"));
        woeidMap.put("2347607", new Place(
                "Naâma", "DZA", "AG49"));
        woeidMap.put("2345445", new Place(
                "Maccarthy Island", "GMB", "GA03"));
        woeidMap.put("2345446", new Place(
                "Upper River", "GMB", "GA04"));
        woeidMap.put("2345444", new Place(
                "Lower River", "GMB", "GA02"));
        woeidMap.put("2345467", new Place(
                "Northern", "GHA", "GH06"));
        woeidMap.put("2345470", new Place(
                "Upper East", "GHA", "GH10"));
        woeidMap.put("2345471", new Place(
                "Upper West", "GHA", "GH11"));
        woeidMap.put("2345463", new Place(
                "Ashanti", "GHA", "GH02"));
        woeidMap.put("2345464", new Place(
                "Brong Ahafo", "GHA", "GH03"));
        woeidMap.put("2345465", new Place(
                "Central", "GHA", "GH04"));
        woeidMap.put("2344826", new Place(
                "Borgou", "BEN", "BN10"));
        woeidMap.put("55967672", new Place(
                "Alibori", "BEN", "BN07"));
        woeidMap.put("55967670", new Place(
                "Collines", "BEN", "BN11"));
        woeidMap.put("2345462", new Place(
                "Greater Accra", "GHA", "GH01"));
        woeidMap.put("2345468", new Place(
                "Volta", "GHA", "GH08"));
        woeidMap.put("2344825", new Place(
                "Atlantique", "BEN", "BN09"));
        woeidMap.put("55967673", new Place(
                "Littoral", "BEN", "BN14"));
        woeidMap.put("55967668", new Place(
                "Kouffo", "BEN", "BN12"));
        woeidMap.put("2344828", new Place(
                "Ouémé", "BEN", "BN16"));
        woeidMap.put("2344829", new Place(
                "Zou", "BEN", "BN18"));
        woeidMap.put("55967669", new Place(
                "Plateau", "BEN", "BN17"));
        woeidMap.put("2344827", new Place(
                "Mono", "BEN", "BN15"));
        woeidMap.put("2344824", new Place(
                "Atakora", "BEN", "BN08"));
        woeidMap.put("55967671", new Place(
                "Donga", "BEN", "BN13"));
        woeidMap.put("55967354", new Place(
                "Kompienga", "BFA", "UV22"));
        woeidMap.put("2347617", new Place(
                "Gourma", "BFA", "UV22"));
        woeidMap.put("55998384", new Place(
                "Cuvette - Ouest", "COG", "CF10"));
        woeidMap.put("2345454", new Place(
                "Ogooué - Ivindo", "GAB", "GB06"));
        woeidMap.put("2345457", new Place(
                "Wouleu - Ntem", "GAB", "GB09"));
        woeidMap.put("2344623", new Place(
                "Tamanghasset", "DZA", "AG53"));
        woeidMap.put("2347607", new Place(
                "Boumerdès", "DZA", "AG40"));
        woeidMap.put("2347607", new Place(
                "Bordj Bou Arréridj", "DZA", "AG39"));
        woeidMap.put("2347607", new Place(
                "Béjaïa", "DZA", "AG18"));
        woeidMap.put("24549661", new Place(
                "West Bosnia", "BIH", "BK01"));
        woeidMap.put("24549661", new Place(
                "Una - Sana", "BIH", "HR19"));
        woeidMap.put("24549661", new Place(
                "Central Bosnia", "BIH", "BK01"));
        woeidMap.put("24549661", new Place(
                "West Herzegovina", "BIH", "HR03"));
        woeidMap.put("24549661", new Place(
                "Herzegovina - Neretva", "BIH", "HR03"));
        woeidMap.put("2347266", new Place(
                "Aydin", "TUR", "TU09"));
        woeidMap.put("2347290", new Place(
                "Izmir", "TUR", "TU35"));
        woeidMap.put("2347267", new Place(
                "Balikesir", "TUR", "TU10"));
        woeidMap.put("2347274", new Place(
                "Çanakkale", "TUR", "TU17"));
        woeidMap.put("2347279", new Place(
                "Edirne", "TUR", "TU22"));
        woeidMap.put("2347294", new Place(
                "Kirklareli", "TUR", "TU39"));
        woeidMap.put("2347310", new Place(
                "Tekirdag", "TUR", "TU59"));
        woeidMap.put("20070061", new Place(
                "Grad Sofiya", "BGR", "BU42"));
        woeidMap.put("20070061", new Place(
                "Sofia", "BGR", "BU42"));
        woeidMap.put("2347268", new Place(
                "Bilecik", "TUR", "TU11"));
        woeidMap.put("2347273", new Place(
                "Bursa", "TUR", "TU16"));
        woeidMap.put("2347289", new Place(
                "Istanbul", "TUR", "TU34"));
        woeidMap.put("2347296", new Place(
                "Kocaeli", "TUR", "TU41"));
        woeidMap.put("2347306", new Place(
                "Sakarya", "TUR", "TU54"));
        woeidMap.put("2347271", new Place(
                "Bolu", "TUR", "TU14"));
        woeidMap.put("2347283", new Place(
                "Eskisehir", "TUR", "TU26"));
        woeidMap.put("2347292", new Place(
                "Kastamonu", "TUR", "TU37"));
        woeidMap.put("2347264", new Place(
                "Antalya", "TUR", "TU07"));
        woeidMap.put("2347260", new Place(
                "Afyon", "TUR", "TU03"));
        woeidMap.put("2347272", new Place(
                "Burdur", "TUR", "TU15"));
        woeidMap.put("2347277", new Place(
                "Denizli", "TUR", "TU20"));
        woeidMap.put("2347288", new Place(
                "Isparta", "TUR", "TU33"));
        woeidMap.put("2347297", new Place(
                "Kütahya", "TUR", "TU43"));
        woeidMap.put("2347299", new Place(
                "Manisa", "TUR", "TU45"));
        woeidMap.put("2347301", new Place(
                "Mugla", "TUR", "TU48"));
        woeidMap.put("2347259", new Place(
                "Adiyaman", "TUR", "TU02"));
        woeidMap.put("2347280", new Place(
                "Elazig", "TUR", "TU23"));
        woeidMap.put("2347300", new Place(
                "K.Maras", "TUR", "TU46"));
        woeidMap.put("2347298", new Place(
                "Malatya", "TUR", "TU44"));
        woeidMap.put("2347287", new Place(
                "Mersin", "TUR", "TU32"));
        woeidMap.put("2347295", new Place(
                "Kirsehir", "TUR", "TU40"));
        woeidMap.put("2347293", new Place(
                "Kayseri", "TUR", "TU38"));
        woeidMap.put("2347303", new Place(
                "Nevsehir", "TUR", "TU50"));
        woeidMap.put("2347286", new Place(
                "Hatay", "TUR", "TU31"));
        woeidMap.put("2347262", new Place(
                "Amasya", "TUR", "TU05"));
        woeidMap.put("2347276", new Place(
                "Çorum", "TUR", "TU19"));
        woeidMap.put("2347285", new Place(
                "Giresun", "TUR", "TU28"));
        woeidMap.put("2347304", new Place(
                "Ordu", "TUR", "TU52"));
        woeidMap.put("2347308", new Place(
                "Sinop", "TUR", "TU57"));
        woeidMap.put("2347309", new Place(
                "Sivas", "TUR", "TU58"));
        woeidMap.put("2347307", new Place(
                "Samsun", "TUR", "TU55"));
        woeidMap.put("2347311", new Place(
                "Tokat", "TUR", "TU60"));
        woeidMap.put("2347265", new Place(
                "Artvin", "TUR", "TU08"));
        woeidMap.put("2347282", new Place(
                "Erzurum", "TUR", "TU25"));
        woeidMap.put("2347281", new Place(
                "Erzincan", "TUR", "TU24"));
        woeidMap.put("2347305", new Place(
                "Rize", "TUR", "TU53"));
        woeidMap.put("2347312", new Place(
                "Trabzon", "TUR", "TU61"));
        woeidMap.put("2346887", new Place(
                "Stavropol '	", "	RUS	", "	RS70	"));
        woeidMap.put("2347261", new Place(
                "Agri", "TUR", "TU04"));
        woeidMap.put("2347269", new Place(
                "Bingöl", "TUR", "TU12"));
        woeidMap.put("2347278", new Place(
                "Diyarbakir", "TUR", "TU21"));
        woeidMap.put("2347302", new Place(
                "Mus", "TUR", "TU49"));
        woeidMap.put("2347270", new Place(
                "Bitlis", "TUR", "TU13"));
        woeidMap.put("2347006", new Place(
                "Bakool", "SOM", "SO01"));
        woeidMap.put("2347009", new Place(
                "Bay", "SOM", "SO04"));
        woeidMap.put("2347011", new Place(
                "Gedo", "SOM", "SO06"));
        woeidMap.put("2347013", new Place(
                "Jubbada Dhexe", "SOM", "SO08"));
        woeidMap.put("2347019", new Place(
                "Shabeellaha Hoose", "SOM", "SO02"));
        woeidMap.put("24554868", new Place(
                "Essex", "GBR", "UK15"));
        woeidMap.put("24554868", new Place(
                "Suffolk", "GBR", "UK39"));
        woeidMap.put("24554868", new Place(
                "Norfolk", "GBR", "UK29"));
        woeidMap.put("2344715", new Place(
                "Vorarlberg", "AUT", "AU08"));
        woeidMap.put("2344708", new Place(
                "Burgenland", "AUT", "AU01"));
        woeidMap.put("2344713", new Place(
                "Steiermark", "AUT", "AU06"));
        woeidMap.put("2344709", new Place(
                "Kärnten", "AUT", "AU02"));
        woeidMap.put("2344711", new Place(
                "Oberösterreich", "AUT", "AU04"));
        woeidMap.put("2344714", new Place(
                "Tirol", "AUT", "AU07"));
        woeidMap.put("2344710", new Place(
                "Niederösterreich", "AUT", "AU03"));
        woeidMap.put("2344710", new Place(
                "Wien", "AUT", "AU09"));
        woeidMap.put("2346920", new Place(
                "Pskov", "RUS", "RS60"));
        woeidMap.put("2346925", new Place(
                "Smolensk", "RUS", "RS69"));
        woeidMap.put("20070508", new Place(
                "Arkhangel 'sk	", "	RUS	", "	RS06	"));
        woeidMap.put("2346903", new Place(
                "Kostroma", "RUS", "RS37"));
        woeidMap.put("2346936", new Place(
                "Yaroslavl '	", "	RUS	", "	RS88	"));
        woeidMap.put("2346922", new Place(
                "Ryazan '	", "	RUS	", "	RS62	"));
        woeidMap.put("2346927", new Place(
                "Tambov", "RUS", "RS72"));
        woeidMap.put("2346866", new Place(
                "Bashkortostan", "RUS", "RS08"));
        woeidMap.put("2346874", new Place(
                "Komi", "RUS", "RS34"));
        woeidMap.put("2346875", new Place(
                "Mariy - El", "RUS", "RS45"));
        woeidMap.put("2346890", new Place(
                "Astrakhan '	", "	RUS	", "	RS07	"));
        woeidMap.put("2346906", new Place(
                "Samara", "RUS", "RS65"));
        woeidMap.put("2346878", new Place(
                "Tatarstan", "RUS", "RS73"));
        woeidMap.put("20070528", new Place(
                "Tyumen '	", "	RUS	", "	RS78	"));
        woeidMap.put("20070530", new Place(
                "Altay", "RUS", "RS04"));
        woeidMap.put("20070530", new Place(
                "Gorno - Altay", "RUS", "RS03"));
        woeidMap.put("2346257", new Place(
                "Al Wusta", "OMN", "MU02"));
        woeidMap.put("2346256", new Place(
                "Ash Sharqiyah", "OMN", "MU01"));
        woeidMap.put("2347010", new Place(
                "Galguduud", "SOM", "SO05"));
        woeidMap.put("2347012", new Place(
                "Hiiraan", "SOM", "SO07"));
        woeidMap.put("2347018", new Place(
                "Shabeellaha Dhexe", "SOM", "SO13"));
        woeidMap.put("2346258", new Place(
                "Dhofar", "OMN", "MU02"));
        woeidMap.put("2347015", new Place(
                "Mudug", "SOM", "SO10"));
        woeidMap.put("2346868", new Place(
                "Chechnya", "RUS", "RS12"));
        woeidMap.put("2346870", new Place(
                "Dagestan", "RUS", "RS17"));
        woeidMap.put("4693371", new Place(
                "Musandam", "OMN", "MU07"));
        woeidMap.put("2346260", new Place(
                "Muscat", "OMN", "MU02"));
        woeidMap.put("20070458", new Place(
                "Delhi", "IND", "IN07"));
        woeidMap.put("2345745", new Place(
                "Himachal Pradesh", "IND", "IN11"));
        woeidMap.put("2345744", new Place(
                "Haryana", "IND", "IN10"));
        woeidMap.put("2345746", new Place(
                "Jammu and Kashmir", "IND", "IN12"));
        woeidMap.put("2344873", new Place(
                "Chhukha", "BTN", "BT06"));
        woeidMap.put("2344875", new Place(
                "Daga", "BTN", "BT08"));
        woeidMap.put("2344880", new Place(
                "Paro", "BTN", "BT13"));
        woeidMap.put("55967862", new Place(
                "Gasa", "BTN", "BT15"));
        woeidMap.put("2344883", new Place(
                "Samchi", "BTN", "BT16"));
        woeidMap.put("2344887", new Place(
                "Thimphu", "BTN", "BT20"));
        woeidMap.put("2344882", new Place(
                "Punakha", "BTN", "BT00"));
        woeidMap.put("2345740", new Place(
                "Andhra Pradesh", "IND", "IN02"));
        woeidMap.put("2345747", new Place(
                "Kerala", "IND", "IN13"));
        woeidMap.put("2345748", new Place(
                "Lakshadweep", "IND", "IN14"));
        woeidMap.put("2345755", new Place(
                "Orissa", "IND", "IN21"));
        woeidMap.put("20070457", new Place(
                "Dadra and Nagar Haveli", "IND", "IN06"));
        woeidMap.put("2345753", new Place(
                "Karnataka", "IND", "IN19"));
        woeidMap.put("2345750", new Place(
                "Maharashtra", "IND", "IN16"));
        woeidMap.put("2345739", new Place(
                "Andaman and Nicobar", "IND", "IN01"));
        woeidMap.put("2345741", new Place(
                "Assam", "IND", "IN03"));
        woeidMap.put("2345751", new Place(
                "Manipur", "IND", "IN17"));
        woeidMap.put("2345754", new Place(
                "Nagaland", "IND", "IN20"));
        woeidMap.put("2344872", new Place(
                "Bumthang", "BTN", "BT05"));
        woeidMap.put("2344874", new Place(
                "Chirang", "BTN", "BT07"));
        woeidMap.put("2344876", new Place(
                "Geylegphug", "BTN", "BT09"));
        woeidMap.put("2344878", new Place(
                "Lhuntshi", "BTN", "BT11"));
        woeidMap.put("55967863", new Place(
                "Tashi Yangtse", "BTN", "BT00"));
        woeidMap.put("2344885", new Place(
                "Shemgang", "BTN", "BT18"));
        woeidMap.put("2344888", new Place(
                "Tongsa", "BTN", "BT21"));
        woeidMap.put("2344889", new Place(
                "Wangdi Phodrang", "BTN", "BT22"));
        woeidMap.put("2345752", new Place(
                "Meghalaya", "IND", "IN18"));
        woeidMap.put("2344881", new Place(
                "Pemagatsel", "BTN", "BT14"));
        woeidMap.put("2344886", new Place(
                "Tashigang", "BTN", "BT19"));
        woeidMap.put("2345965", new Place(
                "Chungcheongbuk - do	", "KOR	", "KS05	"));
        woeidMap.put("2345966", new Place(
                "Gangwon - do	", "KOR	", "KS06	"));
        woeidMap.put("2345969", new Place(
                "Gyeonggi - do	", "KOR	", "KS13	"));
        woeidMap.put("2345964", new Place(
                "Jeollabuk - do	", "KOR	", "KS03	"));
        woeidMap.put("2345973", new Place(
                "Chungcheongnam - do	", "KOR	", "KS17	"));
        woeidMap.put("2345975", new Place(
                "Daejeon", "KOR", "KS19"));
        woeidMap.put("2345967", new Place(
                "Gyeongsangnam - do	", "KOR	", "KS20	"));
        woeidMap.put("2345974", new Place(
                "Kwangju - gwangyoksi", "KOR", "KS18"));
        woeidMap.put("2345971", new Place(
                "Taegu - gwangyoksi", "KOR", "KS15"));
        woeidMap.put("2345963", new Place(
                "Jeju", "KOR", "KS01"));
        woeidMap.put("23424729", new Place(
                "Tawi - Tawi", "PHL", "RP72"));
        woeidMap.put("23424721", new Place(
                "Bohol", "PHL", "RP11"));
        woeidMap.put("23424725", new Place(
                "Guimaras", "PHL", "RP30"));
        woeidMap.put("23424721", new Place(
                "Negros Oriental", "PHL", "RP46"));
        woeidMap.put("23424725", new Place(
                "Negros Occidental", "PHL", "RPH3"));
        woeidMap.put("23424729", new Place(
                "Basilan", "PHL", "RP22"));
        woeidMap.put("23424731", new Place(
                "Zamboanga del Norte", "PHL", "RP65"));
        woeidMap.put("23424731", new Place(
                "Zamboanga del Sur", "PHL", "RP65"));
        woeidMap.put("23424731", new Place(
                "Zamboanga Del Sur", "PHL", "RP66"));
        woeidMap.put("23424730", new Place(
                "Misamis Occidental", "PHL", "RP42"));
        woeidMap.put("23424729", new Place(
                "Sulu", "PHL", "RP60"));
        woeidMap.put("23424725", new Place(
                "Aklan", "PHL", "RP04"));
        woeidMap.put("23424725", new Place(
                "Antique", "PHL", "RP06"));
        woeidMap.put("23424725", new Place(
                "Antique", "PHL", "RP06"));
        woeidMap.put("23424725", new Place(
                "Capiz", "PHL", "RP18"));
        woeidMap.put("23424725", new Place(
                "Guimaras", "PHL", "RP30"));
        woeidMap.put("23424719", new Place(
                "Occidental Mindoro", "PHL", "RP49"));
        woeidMap.put("23424719", new Place(
                "Occidental Mindoro", "PHL", "RP49"));
        woeidMap.put("23424719", new Place(
                "Occidental Mindoro", "PHL", "RP49"));
        woeidMap.put("23424725", new Place(
                "Palawan", "PHL", "RP49"));
        woeidMap.put("23424720", new Place(
                "Albay", "PHL", "RP05"));
        woeidMap.put("23424720", new Place(
                "Camarines Norte", "PHL", "RP15"));
        woeidMap.put("23424720", new Place(
                "Camarines Sur", "PHL", "RP16"));
        woeidMap.put("23424720", new Place(
                "Catanduanes", "PHL", "RP19"));
        woeidMap.put("23424716", new Place(
                "Abra", "PHL", "RP01"));
        woeidMap.put("23424715", new Place(
                "Batanes", "PHL", "RP07"));
        woeidMap.put("23424715", new Place(
                "Cagayan", "PHL", "RP14"));
        woeidMap.put("23424715", new Place(
                "Cagayan", "PHL", "RP14"));
        woeidMap.put("23424716", new Place(
                "Apayao", "PHL", "RP32"));
        woeidMap.put("23424724", new Place(
                "Ilocos Norte", "PHL", "RP28"));
        woeidMap.put("23424724", new Place(
                "Ilocos Sur", "PHL", "RP29"));
        woeidMap.put("23424722", new Place(
                "Aurora", "PHL", "RPG8"));
        woeidMap.put("23424715", new Place(
                "Isabela", "PHL", "RP31"));
        woeidMap.put("23424716", new Place(
                "Ifugao", "PHL", "RP32"));
        woeidMap.put("23424716", new Place(
                "Mountain Province", "PHL", "RP44"));
        woeidMap.put("23424715", new Place(
                "Nueva Vizcaya", "PHL", "RP48"));
        woeidMap.put("23424715", new Place(
                "Quirino", "PHL", "RP68"));
        woeidMap.put("23424722", new Place(
                "Bataan", "PHL", "RP07"));
        woeidMap.put("23424722", new Place(
                "Nueva Ecija", "PHL", "RP47"));
        woeidMap.put("23424722", new Place(
                "Pampanga", "PHL", "RP50"));
        woeidMap.put("23424716", new Place(
                "Benguet", "PHL", "RP10"));
        woeidMap.put("23424722", new Place(
                "Zambales", "PHL", "RP64"));
        woeidMap.put("23424724", new Place(
                "La Union", "PHL", "RP36"));
        woeidMap.put("23424724", new Place(
                "Pangasinan", "PHL", "RP51"));
        woeidMap.put("23424717", new Place(
                "Cavite", "PHL", "RP07"));
        woeidMap.put("23424717", new Place(
                "Laguna", "PHL", "RP33"));
        woeidMap.put("23424717", new Place(
                "Rizal", "PHL", "RP53"));
        woeidMap.put("23424718", new Place(
                "Metropolitan Manila", "PHL", "RPD9"));
        woeidMap.put("23424719", new Place(
                "Marinduque", "PHL", "RP38"));
        woeidMap.put("23424719", new Place(
                "Occidental Mindoro", "PHL", "RP40"));
        woeidMap.put("23424719", new Place(
                "Oriental Mindoro", "PHL", "RP41"));
        woeidMap.put("23424730", new Place(
                "Lanao del Norte", "PHL", "RP34"));
        woeidMap.put("23424729", new Place(
                "Lanao del Sur", "PHL", "RP35"));
        woeidMap.put("23424729", new Place(
                "Lanao Del Sur", "PHL", "RP56"));
        woeidMap.put("23424729", new Place(
                "Maguindanao", "PHL", "RP56"));
        woeidMap.put("23424729", new Place(
                "Shariff Kabunsuan", "PHL", "RP56"));
        woeidMap.put("23424728", new Place(
                "North Cotabato", "PHL", "RP57"));
        woeidMap.put("23424728", new Place(
                "North Cotabato", "PHL", "RP57"));
        woeidMap.put("23424728", new Place(
                "Sultan Kudarat", "PHL", "RP71"));
        woeidMap.put("23424723", new Place(
                "Eastern Samar", "PHL", "RP23"));
        woeidMap.put("23424723", new Place(
                "Leyte", "PHL", "RP37"));
        woeidMap.put("23424723", new Place(
                "Samar", "PHL", "RP55"));
        woeidMap.put("23424723", new Place(
                "Southern Leyte", "PHL", "RP59"));
        woeidMap.put("23424723", new Place(
                "Northern Samar", "PHL", "RP67"));
        woeidMap.put("23424726", new Place(
                "Agusan del Norte", "PHL", "RP02"));
        woeidMap.put("23424726", new Place(
                "Agusan del Sur", "PHL", "RP03"));
        woeidMap.put("23424730", new Place(
                "Bukidnon", "PHL", "RP12"));
        woeidMap.put("23424730", new Place(
                "Camiguin", "PHL", "RP17"));
        woeidMap.put("23424727", new Place(
                "Davao del Norte", "PHL", "RP24"));
        woeidMap.put("23424727", new Place(
                "Compostela Valley", "PHL", "RP24"));
        woeidMap.put("23424726", new Place(
                "Dinagat Islands", "PHL", "RP61"));
        woeidMap.put("23424726", new Place(
                "Surigao del Sur", "PHL", "RP62"));
        woeidMap.put("23424730", new Place(
                "Misamis Oriental", "PHL", "RP43"));
        woeidMap.put("23424727", new Place(
                "Davao Del Sur", "PHL", "RP25"));
        woeidMap.put("23424727", new Place(
                "Davao Oriental", "PHL", "RP26"));
        woeidMap.put("23424728", new Place(
                "Sarangani", "PHL", "RP25"));
        woeidMap.put("23424728", new Place(
                "South Cotabato", "PHL", "RP70"));
        woeidMap.put("23424728", new Place(
                "Sultan Kudarat", "PHL", "RP70"));
        woeidMap.put("2346896", new Place(
                "Irkutsk", "RUS", "RS20"));
        woeidMap.put("2346937", new Place(
                "Sakhalin", "RUS", "RS64"));
        woeidMap.put("2345335", new Place(
                "Central", "FJI", "FJ01"));
        woeidMap.put("2345337", new Place(
                "Northern", "FJI", "FJ03"));
        woeidMap.put("2345451", new Place(
                "Moyen - Ogooué", "GAB", "GB03"));
        woeidMap.put("2345452", new Place(
                "Ngounié", "GAB", "GB04"));
        woeidMap.put("2345453", new Place(
                "Nyanga", "GAB", "GB05"));
        woeidMap.put("2345456", new Place(
                "Ogooué - Maritime", "GAB", "GB08"));
        woeidMap.put("2344744", new Place(
                "Kgalagadi", "BWA", "BC04"));
        woeidMap.put("2344967", new Place(
                "Bouenza", "COG", "CF01"));
        woeidMap.put("2345450", new Place(
                "Haut - Ogooué", "GAB", "GB02"));
        woeidMap.put("2345455", new Place(
                "Ogooué - Lolo", "GAB", "GB07"));
        woeidMap.put("2344741", new Place(
                "Central", "BWA", "BC01"));
        woeidMap.put("2344904", new Place(
                "Cankuzo", "BDI", "BY11"));
        woeidMap.put("2344913", new Place(
                "Rutana", "BDI", "BY20"));
        woeidMap.put("2344914", new Place(
                "Ruyigi", "BDI", "BY21"));
        woeidMap.put("2344902", new Place(
                "Bubanza", "BDI", "BY09"));
        woeidMap.put("2344903", new Place(
                "Bururi", "BDI", "BY10"));
        woeidMap.put("2344906", new Place(
                "Gitega", "BDI", "BY13"));
        woeidMap.put("2344908", new Place(
                "Kayanza", "BDI", "BY15"));
        woeidMap.put("2344910", new Place(
                "Makamba", "BDI", "BY17"));
        woeidMap.put("2344909", new Place(
                "Kirundo", "BDI", "BY16"));
        woeidMap.put("2344911", new Place(
                "Muyinga", "BDI", "BY18"));
        woeidMap.put("2347014", new Place(
                "Jubbada Hoose", "SOM", "SO09"));
        woeidMap.put("2344745", new Place(
                "Kgatleng", "BWA", "BC05"));
        woeidMap.put("2344746", new Place(
                "Kweneng", "BWA", "BC06"));
        woeidMap.put("2344749", new Place(
                "South - East", "BWA", "BC09"));
        woeidMap.put("2344701", new Place(
                "Northern Territory", "AUS", "AS03"));
        woeidMap.put("2344706", new Place(
                "Western Australia", "AUS", "AS08"));
        woeidMap.put("2344704", new Place(
                "Christmas Island", "CXR", ""));
        woeidMap.put("2344699", new Place(
                "Australian Capital Territory", "AUS", "AS01"));
        woeidMap.put("2344700", new Place(
                "New South Wales", "AUS", "AS02"));
        woeidMap.put("2344705", new Place(
                "Victoria", "AUS", "AS07"));
        woeidMap.put("2344702", new Place(
                "Queensland", "AUS", "AS04"));
        woeidMap.put("20069921", new Place(
                "Rotuma", "FJI", "FJ04"));
        woeidMap.put("2344704", new Place(
                "Tasmania", "AUS", "AS06"));
        woeidMap.put("7153311", new Place(
                "Basse - Normandie", "FRA", "FR99"));
        woeidMap.put("7153313", new Place(
                "Bretagne", "FRA", "FRA2"));
        woeidMap.put("7153327", new Place(
                "Poitou - Charentes", "FRA", "FRB7"));
        woeidMap.put("7153325", new Place(
                "Pays de la Loire", "FRA", "FRA5"));
        woeidMap.put("7153309", new Place(
                "Aquitaine", "FRA", "FR97"));
        woeidMap.put("7153316", new Place(
                "Corse", "FRA", "FR14"));
        woeidMap.put("7153318", new Place(
                "Provence - Alpes - Côte - d 'Azur	", "	FRA	", "	FRB8	"));
        woeidMap.put("7153310", new Place(
                "Auvergne", "FRA", "FR98"));
        woeidMap.put("7153312", new Place(
                "Bourgogne", "FRA", "FRA1"));
        woeidMap.put("7153318", new Place(
                "Haute - Normandie", "FRA", "FRA7"));
        woeidMap.put("24554868", new Place(
                "East Sussex", "GBR", "UK14"));
        woeidMap.put("7153313", new Place(
                "Île - de - France", "FRA", "FRA8"));
        woeidMap.put("7153321", new Place(
                "Limousin", "FRA", "FRB1"));
        woeidMap.put("7153326", new Place(
                "Picardie", "FRA", "FRB6"));
        woeidMap.put("7153317", new Place(
                "Franche - Comté", "FRA", "FRA6"));
        woeidMap.put("7153330", new Place(
                "Alsace", "FRA", "FR96"));
        woeidMap.put("7153322", new Place(
                "Lorraine", "FRA", "FRB2"));
        woeidMap.put("2346187", new Place(
                "Timbuktu", "MLI", "ML08"));
        woeidMap.put("55999799", new Place(
                "Kidal", "MLI", "ML10"));
        woeidMap.put("2346181", new Place(
                "Gao", "MLI", "ML09"));
        woeidMap.put("2345027", new Place(
                "Magallanes y Antártica Chilena", "CHL", "CI10"));
        woeidMap.put("56043702", new Place(
                "Arica y Parinacota", "CHL", ""));
        woeidMap.put("2345022", new Place(
                "Atacama", "CHL", "CI05"));
        woeidMap.put("2345024", new Place(
                "Coquimbo", "CHL", "CI07"));
        woeidMap.put("2345029", new Place(
                "Región Metropolitana de Santiago", "CHL", "CI12"));
        woeidMap.put("2345018", new Place(
                "Valparaíso", "CHL", "CI01"));
        woeidMap.put("2345025", new Place(
                "Libertador General Bernardo O 'Higgins	", "	CHL	", "	CI08	"));
        woeidMap.put("2345026", new Place(
                "Los Lagos", "CHL", "CI09"));
        woeidMap.put("2345028", new Place(
                "Maule", "CHL", "CI06"));
        woeidMap.put("2346265", new Place(
                "Baja California", "MEX", "MX02"));
        woeidMap.put("2346266", new Place(
                "Baja California Sur", "MEX", "MX03"));
        woeidMap.put("2347602", new Place(
                "Coahuila", "MEX", "MX07"));
        woeidMap.put("2347561", new Place(
                "Sonora", "MEX", "MX26"));
        woeidMap.put("2346287", new Place(
                "San Luis Potosí", "MEX", "MX24"));
        woeidMap.put("2347602", new Place(
                "Tamaulipas", "MEX", "MX28"));
        woeidMap.put("2346277", new Place(
                "Jalisco", "MEX", "MX14"));
        woeidMap.put("2346279", new Place(
                "Michoacán", "MEX", "MX16"));
        woeidMap.put("2346281", new Place(
                "Nayarit", "MEX", "MX18"));
        woeidMap.put("2346283", new Place(
                "Oaxaca", "MEX", "MX20"));
        woeidMap.put("2346290", new Place(
                "Tabasco", "MEX", "MX32"));
        woeidMap.put("2346272", new Place(
                "Distrito Federal", "MEX", "MX09"));
        woeidMap.put("2346275", new Place(
                "Guerrero", "MEX", "MX12"));
        woeidMap.put("2346276", new Place(
                "Hidalgo", "MEX", "MX13"));
        woeidMap.put("2346280", new Place(
                "Morelos", "MEX", "MX17"));
        woeidMap.put("2346285", new Place(
                "Querétaro", "MEX", "MX22"));
        woeidMap.put("2346293", new Place(
                "Veracruz", "MEX", "MX30"));
        woeidMap.put("2346268", new Place(
                "Chiapas", "MEX", "MX05"));
        woeidMap.put("2346286", new Place(
                "Quintana Roo", "MEX", "MX23"));
        woeidMap.put("20069858", new Place(
                "Kommuneqarfik Sermersooq", "GRL", ""));
        woeidMap.put("2347599", new Place(
                "Kommune Kujalleq", "GRL", ""));
        woeidMap.put("2347599", new Place(
                "Qeqqata Kommunia", "GRL", ""));
        woeidMap.put("2347581", new Place(
                "Nationalparken", "GRL", ""));
        woeidMap.put("2347599", new Place(
                "Qaasuitsup Kommunia", "GRL", ""));
        woeidMap.put("12578048", new Place(
                "Highland", "GBR", "UK83"));
        woeidMap.put("12578048", new Place(
                "Shetland Islands", "GBR", "UK83"));
        woeidMap.put("24554868", new Place(
                "West Sussex", "GBR", "UK44"));
        woeidMap.put("24554868", new Place(
                "Northamptonshire", "GBR", "UK31"));
        woeidMap.put("24554868", new Place(
                "Warwickshire", "GBR", "UK42"));
        woeidMap.put("24554868", new Place(
                "Oxfordshire", "GBR", "UK34"));
        woeidMap.put("24554868", new Place(
                "Surrey", "GBR", "UK40"));
        woeidMap.put("24554868", new Place(
                "Wiltshire", "GBR", "UK46"));
        woeidMap.put("24554868", new Place(
                "Isle of Wight", "GBR", "UK23"));
        woeidMap.put("24554868", new Place(
                "Nottinghamshire", "GBR", "UK33"));
        woeidMap.put("12578048", new Place(
                "Eilean Siar", "GBR", "UK89"));
        woeidMap.put("24554868", new Place(
                "Herefordshire", "GBR", "UK20"));
        woeidMap.put("24554868", new Place(
                "Worcestershire", "GBR", "UK20"));
        woeidMap.put("24554868", new Place(
                "Staffordshire", "GBR", "UK38"));
        woeidMap.put("24554868", new Place(
                "Shropshire", "GBR", "UK35"));
        woeidMap.put("24554868", new Place(
                "West Yorkshire", "GBR", "UK45"));
        woeidMap.put("24554868", new Place(
                "South Yorkshire", "GBR", "UK37"));
        woeidMap.put("2346251", new Place(
                "Tiris Zemmour", "MRT", "MR11"));
        woeidMap.put("2346245", new Place(
                "Brakna", "MRT", "MR05"));
        woeidMap.put("2346248", new Place(
                "Dakhlet Nouadhibou", "MRT", "MR08"));
        woeidMap.put("2346252", new Place(
                "Inchiri", "MRT", "MR12"));
        woeidMap.put("2346246", new Place(
                "Trarza", "MRT", "MR06"));
        woeidMap.put("2346243", new Place(
                "Assaba", "MRT", "MR03"));
        woeidMap.put("2346250", new Place(
                "Guidimaka", "MRT", "MR10"));
        woeidMap.put("2346180", new Place(
                "Bamako", "MLI", "ML07"));
        woeidMap.put("2346182", new Place(
                "Kayes", "MLI", "ML03"));
        woeidMap.put("2346185", new Place(
                "Sikasso", "MLI", "ML06"));
        woeidMap.put("2346247", new Place(
                "Adrar", "MRT", "MR07"));
        woeidMap.put("2346241", new Place(
                "Hodh ech Chargui", "MRT", "MR01"));
        woeidMap.put("2346242", new Place(
                "Hodh el Gharbi", "MRT", "MR02"));
        woeidMap.put("2346249", new Place(
                "Tagant", "MRT", "MR09"));
        woeidMap.put("2347618", new Place(
                "Houet", "BFA", "UV51"));
        woeidMap.put("55967360", new Place(
                "Banwa", "BFA", "UV58"));
        woeidMap.put("2347624", new Place(
                "Mou Houn", "BFA", "UV63"));
        woeidMap.put("2347628", new Place(
                "Oudalan", "BFA", "UV33"));
        woeidMap.put("2347635", new Place(
                "Soum", "BFA", "UV40"));
        woeidMap.put("55967361", new Place(
                "Nayala", "BFA", "UV73"));
        woeidMap.put("2347636", new Place(
                "Sourou", "BFA", "UV73"));
        woeidMap.put("2346183", new Place(
                "Mopti", "MLI", "ML22"));
        woeidMap.put("2346184", new Place(
                "Ségou", "MLI", "ML05"));
        woeidMap.put("2347610", new Place(
                "Bam", "BFA", "UV15"));
        woeidMap.put("55967365", new Place(
                "Kourwéogo", "BFA", "UV53"));
        woeidMap.put("2347619", new Place(
                "Kadiogo", "BFA", "UV53"));
        woeidMap.put("2347627", new Place(
                "Oubritenga", "BFA", "UV68"));
        woeidMap.put("55967363", new Place(
                "Zondoma", "BFA", "UV34"));
        woeidMap.put("2347634", new Place(
                "Sissili", "BFA", "UV72"));
        woeidMap.put("55967362", new Place(
                "Loroum", "BFA", "UV15"));
        woeidMap.put("2347638", new Place(
                "Yatenga", "BFA", "UV76"));
        woeidMap.put("2347625", new Place(
                "Namentenga", "BFA", "UV64"));
        woeidMap.put("2347632", new Place(
                "Sanmatenga", "BFA", "UV70"));
        woeidMap.put("2347613", new Place(
                "Boulgou", "BFA", "UV49"));
        woeidMap.put("55967355", new Place(
                "Koulpélogo", "BFA", "UV49"));
        woeidMap.put("2347623", new Place(
                "Kouritenga", "BFA", "UV28"));
        woeidMap.put("2347626", new Place(
                "Nahouri", "BFA", "UV65"));
        woeidMap.put("55967357", new Place(
                "Ioba", "BFA", "UV48"));
        woeidMap.put("55967366", new Place(
                "Tuy", "BFA", "UV51"));
        woeidMap.put("55967359", new Place(
                "Léraba", "BFA", "UV54"));
        woeidMap.put("2347621", new Place(
                "Komoé", "BFA", "UV55"));
        woeidMap.put("2344971", new Place(
                "Likouala", "COG", "CF06"));
        woeidMap.put("2346355", new Place(
                "Borno", "NGA", "NI27"));
        woeidMap.put("2346361", new Place(
                "Water body", "NGA", "CD07"));
        woeidMap.put("2346362", new Place(
                "Abia", "NGA", "NI45"));
        woeidMap.put("2346349", new Place(
                "Akwa Ibom", "NGA", "NI21"));
        woeidMap.put("2346356", new Place(
                "Imo", "NGA", "NI28"));
        woeidMap.put("2346344", new Place(
                "Rivers", "NGA", "NI50"));
        woeidMap.put("20070152", new Place(
                "Bayelsa", "NGA", "NI52"));
        woeidMap.put("2346354", new Place(
                "Benue", "NGA", "NI26"));
        woeidMap.put("2346350", new Place(
                "Cross River", "NGA", "NI22"));
        woeidMap.put("2346371", new Place(
                "Taraba", "NGA", "NI43"));
        woeidMap.put("2346358", new Place(
                "Kwara", "NGA", "NI30"));
        woeidMap.put("2346342", new Place(
                "Lagos", "NGA", "NI05"));
        woeidMap.put("2346359", new Place(
                "Niger", "NGA", "NI31"));
        woeidMap.put("2346346", new Place(
                "Ogun", "NGA", "NI16"));
        woeidMap.put("2346347", new Place(
                "Ondo", "NGA", "NI48"));
        woeidMap.put("20070151", new Place(
                "Ekiti", "NGA", "NI51"));
        woeidMap.put("2346370", new Place(
                "Osun", "NGA", "NI42"));
        woeidMap.put("2346360", new Place(
                "Oyo", "NGA", "NI32"));
        woeidMap.put("2346353", new Place(
                "Anambra", "NGA", "NI25"));
        woeidMap.put("20070155", new Place(
                "Gombe", "NGA", "NI55"));
        woeidMap.put("2346364", new Place(
                "Delta", "NGA", "NI36"));
        woeidMap.put("2346365", new Place(
                "Edo", "NGA", "NI37"));
        woeidMap.put("2346366", new Place(
                "Enugu", "NGA", "NI47"));
        woeidMap.put("20070153", new Place(
                "Ebonyi", "NGA", "NI53"));
        woeidMap.put("2346351", new Place(
                "Kaduna", "NGA", "NI23"));
        woeidMap.put("2346369", new Place(
                "Kogi", "NGA", "NI41"));
        woeidMap.put("2346348", new Place(
                "Plateau", "NGA", "NI49"));
        woeidMap.put("20070154", new Place(
                "Nassarawa", "NGA", "NI56"));
        woeidMap.put("2346367", new Place(
                "Jigawa", "NGA", "NI39"));
        woeidMap.put("2346357", new Place(
                "Kano", "NGA", "NI29"));
        woeidMap.put("2346361", new Place(
                "Sokoto", "NGA", "NI51"));
        woeidMap.put("20070150", new Place(
                "Zamfara", "NGA", "NI57"));
        woeidMap.put("2346372", new Place(
                "Yobe", "NGA", "NI44"));
        woeidMap.put("55967353", new Place(
                "Komondjari", "BFA", "UV21"));
        woeidMap.put("55967364", new Place(
                "Yagha", "BFA", "UV71"));
        woeidMap.put("2347637", new Place(
                "Tapoa", "BFA", "UV42"));
        woeidMap.put("2346368", new Place(
                "Kebbi", "NGA", "NI40"));
        woeidMap.put("2344974", new Place(
                "Sangha", "COG", "CF10"));
        woeidMap.put("2346363", new Place(
                "Adamawa", "NGA", "NI35"));
        woeidMap.put("12577879", new Place(
                "Attiki", "GRC", "GR35"));
        woeidMap.put("12577887", new Place(
                "Peloponnisos", "GRC", "GR36"));
        woeidMap.put("12577880", new Place(
                "Dytiki Ellada", "GRC", "GR38"));
        woeidMap.put("24549661", new Place(
                "Tuzla", "BIH", "BK00"));
        woeidMap.put("24549662", new Place(
                "Sarajevo", "BIH", "BK00"));
        woeidMap.put("24549661", new Place(
                "Bosnian Podrinje", "BIH", "BK00"));
        woeidMap.put("12577881", new Place(
                "Dytiki Makedonia", "GRC", "GR08"));
        woeidMap.put("2347583", new Place(
                "Vevcani", "MKD", "MK99"));
        woeidMap.put("24550746", new Place(
                "Debarca", "MKD", "MK00"));
        woeidMap.put("12577889", new Place(
                "Thessalia", "GRC", "GR21"));
        woeidMap.put("2347583", new Place(
                "Southwestern", "MKD", "MK80"));
        woeidMap.put("2347583", new Place(
                "Vardar", "MKD", "MK87"));
        woeidMap.put("2347583", new Place(
                "Northeastern", "MKD", "MK97"));
        woeidMap.put("2347583", new Place(
                "tip", "MKD", "MK98"));
        woeidMap.put("24550752", new Place(
                "Cair", "MKD", "MKA3"));
        woeidMap.put("2347583", new Place(
                "Vranetica", "MKD", "MKB6"));
        woeidMap.put("2347583", new Place(
                "elino", "MKD", "MKC3"));
        woeidMap.put("55848399", new Place(
                "Butel", "MKD", "MK13"));
        woeidMap.put("24550756", new Place(
                "Centar", "MKD", "MK17"));
        woeidMap.put("2347583", new Place(
                "Eastern", "MKD", "MK19"));
        woeidMap.put("7153333", new Place(
                "Ceinovo - Obleevo", "MKD", "MK19"));
        woeidMap.put("24550830", new Place(
                "Cucer Sandevo", "MKD", "MK20"));
        woeidMap.put("2347583", new Place(
                "Gazi Baba", "MKD", "MK32"));
        woeidMap.put("24550769", new Place(
                "Ilinden", "MKD", "MK36"));
        woeidMap.put("2347583", new Place(
                "Karpo", "MKD", "MK41"));
        woeidMap.put("2347583", new Place(
                "Kavadartsi", "MKD", "MK42"));
        woeidMap.put("55848400", new Place(
                "Aerodrom", "MKD", "MK44"));
        woeidMap.put("2347583", new Place(
                "Krivogatani", "MKD", "MK53"));
        woeidMap.put("2347583", new Place(
                "Kruevo", "MKD", "MK54"));
        woeidMap.put("2347583", new Place(
                "Pelagonia", "MKD", "MK67"));
        woeidMap.put("2347583", new Place(
                "Negotino", "MKD", "MK69"));
        woeidMap.put("24550791", new Place(
                "Novatsi", "MKD", "MK71"));
        woeidMap.put("2347583", new Place(
                "Gjorce Petrov", "MKD", "MK00"));
        woeidMap.put("12577883", new Place(
                "Ipeiros", "GRC", "GR17"));
        woeidMap.put("24550756", new Place(
                "Centar upa", "MKD", "MK18"));
        woeidMap.put("2347583", new Place(
                "Southwestern", "MKD", "MK30"));
        woeidMap.put("24550858", new Place(
                "Mavrovo and Rostusa", "MKD", "MK64"));
        woeidMap.put("2347583", new Place(
                "Oslomej", "MKD", "MK77"));
        woeidMap.put("2347583", new Place(
                "Polog", "MKD", "MKB7"));
        woeidMap.put("2347583", new Place(
                "Bogovinje", "MKD", "MK10"));
        woeidMap.put("2347583", new Place(
                "Brvenica", "MKD", "MK12"));
        woeidMap.put("2346122", new Place(
                "Al Jufrah", "LBY", "LY05"));
        woeidMap.put("2346124", new Place(
                "Ash Shati '	", "	LBY	", "	LY13	"));
        woeidMap.put("2346134", new Place(
                "An Nuqat al Khams", "LBY", "LY51"));
        woeidMap.put("2346132", new Place(
                "Al Jabal al Akhdar", "LBY", "LY49"));
        woeidMap.put("12577890", new Place(
                "Voreio Aigaio", "GRC", "GR48"));
        woeidMap.put("12577885", new Place(
                "Kriti", "GRC", "GR43"));
        woeidMap.put("12577884", new Place(
                "Kentriki Makedonia", "GRC", "GR05"));
        woeidMap.put("2347583", new Place(
                "Southeastern", "MKD", "MKA1"));
        woeidMap.put("2347583", new Place(
                "Southeastern", "MKD", "MK11"));
        woeidMap.put("2347583", new Place(
                "Southeastern", "MKD", "MK33"));
        woeidMap.put("24550860", new Place(
                "Dojran", "MKD", "MK00"));
        woeidMap.put("12577878", new Place(
                "Anatoliki Makedonia kai Thraki", "GRC", "GR01"));
        woeidMap.put("2347583", new Place(
                "Phecevo", "MKD", "MK78"));
        woeidMap.put("2347263", new Place(
                "Ankara", "TUR", "TU68"));
        woeidMap.put("2347275", new Place(
                "Çankiri", "TUR", "TU82"));
        woeidMap.put("2347321", new Place(
                "Konya", "TUR", "TU71"));
        woeidMap.put("2347328", new Place(
                "Karaman", "TUR", "TU78"));
        woeidMap.put("12577886", new Place(
                "Notio Aigaio", "GRC", "GR47"));
        woeidMap.put("2347315", new Place(
                "Usak", "TUR", "TU64"));
        woeidMap.put("20070401", new Place(
                "Abkhazia", "GEO", "GG02"));
        woeidMap.put("2347284", new Place(
                "Gaziantep", "TUR", "TU83"));
        woeidMap.put("2347314", new Place(
                "Sanliurfa", "TUR", "TU63"));
        woeidMap.put("2347258", new Place(
                "Adana", "TUR", "TU81"));
        woeidMap.put("2347323", new Place(
                "Nigde", "TUR", "TU73"));
        woeidMap.put("2347325", new Place(
                "Aksaray", "TUR", "TU75"));
        woeidMap.put("2346013", new Place(
                "Beqaa", "LBN", "LE11"));
        woeidMap.put("2347594", new Place(
                "North Lebanon", "LBN", "LE09"));
        woeidMap.put("2346016", new Place(
                "Beirut", "LBN", "LE04"));
        woeidMap.put("2346017", new Place(
                "Mount Lebanon", "LBN", "LE05"));
        woeidMap.put("2347317", new Place(
                "Yozgat", "TUR", "TU66"));
        woeidMap.put("20070400", new Place(
                "Ajaria", "GEO", "GG04"));
        woeidMap.put("2347569", new Place(
                "Guria", "GEO", "GG04"));
        woeidMap.put("2347569", new Place(
                "Samegrelo - Zemo Svaneti", "GEO", "GG04"));
        woeidMap.put("2347569", new Place(
                "Imereti", "GEO", "GG00"));
        woeidMap.put("2347319", new Place(
                "Gümüshane", "TUR", "TU69"));
        woeidMap.put("2347327", new Place(
                "Bayburt", "TUR", "TU77"));
        woeidMap.put("2347569", new Place(
                "Racha - Lechkhumi - Kvemo Svaneti", "GEO", "GG00"));
        woeidMap.put("2347569", new Place(
                "Samtskhe - Javakheti", "GEO", "TU86"));
        woeidMap.put("2347569", new Place(
                "Shida Kartli", "GEO", "GG00"));
        woeidMap.put("2347291", new Place(
                "Kars", "TUR", "TU84"));
        woeidMap.put("2347322", new Place(
                "Mardin", "TUR", "TU72"));
        woeidMap.put("2347326", new Place(
                "Batman", "TUR", "TU76"));
        woeidMap.put("2347324", new Place(
                "Siirt", "TUR", "TU74"));
        woeidMap.put("2347330", new Place(
                "Sirnak", "TUR", "TU80"));
        woeidMap.put("2347313", new Place(
                "Tunceli", "TUR", "TU62"));
        woeidMap.put("2347320", new Place(
                "Hakkari", "TUR", "TU70"));
        woeidMap.put("2347316", new Place(
                "Van", "TUR", "TU65"));
        woeidMap.put("2345845", new Place(
                "At - Ta 'mim	", "	IRQ	", "	IZ13	"));
        woeidMap.put("2345843", new Place(
                "Arbil", "IRQ", "IZ11"));
        woeidMap.put("2345847", new Place(
                "Ninawa", "IRQ", "IZ15"));
        woeidMap.put("2345791", new Place(
                "HaDarom", "ISR", "IS01"));
        woeidMap.put("2345792", new Place(
                "HaMerkaz", "ISR", "IS02"));
        woeidMap.put("2345793", new Place(
                "HaZafon", "ISR", "IS03"));
        woeidMap.put("56049597", new Place(
                "An Nabatiyah", "LBN", "LE07"));
        woeidMap.put("2347594", new Place(
                "South Lebanon", "LBN", "LE06"));
        woeidMap.put("2345844", new Place(
                "Karbala '	", "	IRQ	", "	IZ12	"));
        woeidMap.put("2345839", new Place(
                "Baghdad", "IRQ", "IZ07"));
        woeidMap.put("24550740", new Place(
                "Wakiso", "UGA", "UG37"));
        woeidMap.put("24550736", new Place(
                "Pader", "UGA", "UG92"));
        woeidMap.put("56013541", new Place(
                "Amhara", "ETH", "ET46"));
        woeidMap.put("2345312", new Place(
                "Tigray", "ETH", "ET06"));
        woeidMap.put("56013537", new Place(
                "Afar", "ETH", "ET26"));
        woeidMap.put("24550732", new Place(
                "Mayuge", "UGA", "UG86"));
        woeidMap.put("24550738", new Place(
                "Nakapiripirit", "UGA", "UG91"));
        woeidMap.put("56013543", new Place(
                "Addis Ababa", "ETH", "ET44"));
        woeidMap.put("56013538", new Place(
                "Benshangul - Gumaz", "ETH", "ET47"));
        woeidMap.put("56013543", new Place(
                "Addis Ababa", "ETH", "ET44"));
        woeidMap.put("56013540", new Place(
                "Somali", "ETH", "ET48"));
        woeidMap.put("56013542", new Place(
                "Dire Dawa", "ETH", "ET48"));
        woeidMap.put("56013544", new Place(
                "Harari People", "ETH", "ET50"));
        woeidMap.put("12577928", new Place(
                "Vas", "HUN", "HU22"));
        woeidMap.put("12577948", new Place(
                "Warmian - Masurian", "POL", "PL61"));
        woeidMap.put("12577945", new Place(
                "Pomeranian", "POL", "PL31"));
        woeidMap.put("12577946", new Place(
                "Lower Silesian", "POL", "PL66"));
        woeidMap.put("12577950", new Place(
                "West Pomeranian", "POL", "PL62"));
        woeidMap.put("12577939", new Place(
                "Lubusz", "POL", "PL71"));
        woeidMap.put("12577949", new Place(
                "Greater Poland", "POL", "PL34"));
        woeidMap.put("12577936", new Place(
                "Kuyavian - Pomeranian", "POL", "PL68"));
        woeidMap.put("12577946", new Place(
                "Silesian", "POL", "PL29"));
        woeidMap.put("12577941", new Place(
                "Masovian", "POL", "PL59"));
        woeidMap.put("12577947", new Place(
                "Swietokrzyskie", "POL", "PL36"));
        woeidMap.put("12577943", new Place(
                "Subcarpathian", "POL", "PL63"));
        woeidMap.put("24549661", new Place(
                "Posavina", "BIH", "BK00"));
        woeidMap.put("24549661", new Place(
                "Posavina", "BIH", "BK00"));
        woeidMap.put("12577912", new Place(
                "Baranya", "HUN", "HU02"));
        woeidMap.put("12577918", new Place(
                "Gyor - Moson - Sopron", "HUN", "HU09"));
        woeidMap.put("12577924", new Place(
                "Somogy", "HUN", "HU17"));
        woeidMap.put("12577929", new Place(
                "Veszprém", "HUN", "HU23"));
        woeidMap.put("12577930", new Place(
                "Zala", "HUN", "HU24"));
        woeidMap.put("12577915", new Place(
                "Budapest", "HUN", "HU05"));
        woeidMap.put("12577911", new Place(
                "Bács - Kiskun", "HUN", "HU01"));
        woeidMap.put("12577917", new Place(
                "Fejér", "HUN", "HU08"));
        woeidMap.put("12577921", new Place(
                "Komárom - Esztergom", "HUN", "HU12"));
        woeidMap.put("12577923", new Place(
                "Pest", "HUN", "HU16"));
        woeidMap.put("12577914", new Place(
                "Borsod - Abaúj - Zemplén", "HUN", "HU04"));
        woeidMap.put("12577925", new Place(
                "Szabolcs - Szatmár - Bereg", "HUN", "HU18"));
        woeidMap.put("12577940", new Place(
                "Lesser Poland", "POL", "PL39"));
        woeidMap.put("12577919", new Place(
                "Hajdú - Bihar", "HUN", "HU07"));
        woeidMap.put("12577926", new Place(
                "Jász - Nagykun - Szolnok", "HUN", "HU20"));
        woeidMap.put("12577870", new Place(
                "Lapland", "FIN", ""));
        woeidMap.put("12577866", new Place(
                "Central Finland", "FIN", ""));
        woeidMap.put("12577873", new Place(
                "Eastern Finland", "FIN", ""));
        woeidMap.put("12577872", new Place(
                "Northern Ostrobothnia", "FIN", ""));
        woeidMap.put("12577866", new Place(
                "Central Ostrobothnia", "FIN", ""));
        woeidMap.put("12577866", new Place(
                "Ostrobothnia", "FIN", ""));
        woeidMap.put("12577866", new Place(
                "Southern Ostrobothnia", "FIN", ""));
        woeidMap.put("12577869", new Place(
                "Tavastia Proper", "FIN", ""));
        woeidMap.put("12577866", new Place(
                "Pirkanmaa", "FIN", ""));
        woeidMap.put("12577869", new Place(
                "Southern Finland", "FIN", ""));
        woeidMap.put("12577869", new Place(
                "South Karelia", "FIN", ""));
        woeidMap.put("12577866", new Place(
                "Finland Proper", "FIN", ""));
        woeidMap.put("12577866", new Place(
                "Satakunta", "FIN", ""));
        woeidMap.put("12577869", new Place(
                "Eastern Uusimaa", "FIN", ""));
        woeidMap.put("12577869", new Place(
                "Southern Finland", "FIN", ""));
        woeidMap.put("2346874", new Place(
                "Komi - Permyak", "RUS", "RS90"));
        woeidMap.put("20070180", new Place(
                "Almaty", "KAZ", "KZ01"));
        woeidMap.put("2345772", new Place(
                "Fars", "IRN", "IR07"));
        woeidMap.put("20070201", new Place(
                "Golestan", "IRN", "IR37"));
        woeidMap.put("2345780", new Place(
                "Mazandaran", "IRN", "IR17"));
        woeidMap.put("2345778", new Place(
                "Khuzestan", "IRN", "IR15"));
        woeidMap.put("2345782", new Place(
                "Lorestan", "IRN", "IR23"));
        woeidMap.put("2345836", new Place(
                "Al - Qadisiyah", "IRQ", "IZ04"));
        woeidMap.put("2345841", new Place(
                "Dhi - Qar", "IRQ", "IZ09"));
        woeidMap.put("2345846", new Place(
                "Maysan", "IRQ", "IZ14"));
        woeidMap.put("2345848", new Place(
                "Wasit", "IRQ", "IZ16"));
        woeidMap.put("2345776", new Place(
                "Hormozgan", "IRN", "IR11"));
        woeidMap.put("2345783", new Place(
                "Markazi", "IRN", "IR34"));
        woeidMap.put("2345991", new Place(
                "Mangghystau", "KAZ", "KZ09"));
        woeidMap.put("2345773", new Place(
                "Gilan", "IRN", "IR08"));
        woeidMap.put("2345779", new Place(
                "Kordestan", "IRN", "IR16"));
        woeidMap.put("2345842", new Place(
                "Diyala", "IRQ", "IZ10"));
        woeidMap.put("2345789", new Place(
                "South Khorasan", "IRN", "IR41"));
        woeidMap.put("2345789", new Place(
                "Razavi Khorasan", "IRN", "IR42"));
        woeidMap.put("2345789", new Place(
                "North Khorasan", "IRN", "IR43"));
        woeidMap.put("2345756", new Place(
                "Punjab", "IND", "IN23"));
        woeidMap.put("2345757", new Place(
                "Rajasthan", "IND", "IN24"));
        woeidMap.put("2345760", new Place(
                "Uttar Pradesh", "IND", "IN36"));
        woeidMap.put("20070462", new Place(
                "Uttaranchal", "IND", "IN39"));
        woeidMap.put("20070463", new Place(
                "Jharkhand", "IND", "IN38"));
        woeidMap.put("2345761", new Place(
                "West Bengal", "IND", "IN28"));
        woeidMap.put("2345742", new Place(
                "Bihar", "IND", "IN34"));
        woeidMap.put("2345762", new Place(
                "Sikkim", "IND", "IN29"));
        woeidMap.put("20070464", new Place(
                "Chhattisgarh", "IND", "IN37"));
        woeidMap.put("2345749", new Place(
                "Madhya Pradesh", "IND", "IN35"));
        woeidMap.put("20070459", new Place(
                "Puducherry", "IND", "IN22"));
        woeidMap.put("2345758", new Place(
                "Tamil Nadu", "IND", "IN22"));
        woeidMap.put("2345743", new Place(
                "Gujarat", "IND", "IN32"));
        woeidMap.put("2345764", new Place(
                "Goa", "IND", "IN08"));
        woeidMap.put("2344818", new Place(
                "Bago", "MMR", "BM16"));
        woeidMap.put("20070156", new Place(
                "Bokeo", "LAO", "LA22"));
        woeidMap.put("2344812", new Place(
                "Ayeyarwady", "MMR", "BM03"));
        woeidMap.put("2344816", new Place(
                "Magway", "MMR", "BM15"));
        woeidMap.put("20070160", new Place(
                "Champasak", "LAO", "LA02"));
        woeidMap.put("20070163", new Place(
                "Bolikhamxai", "LAO", "LA00"));
        woeidMap.put("2346001", new Place(
                "Houaphan", "LAO", "LA03"));
        woeidMap.put("20070163", new Place(
                "Bolikhamxai", "LAO", "LA00"));
        woeidMap.put("20070161", new Place(
                "Khammouan", "LAO", "LA15"));
        woeidMap.put("2345763", new Place(
                "Arunachal Pradesh", "IND", "IN30"));
        woeidMap.put("20070461", new Place(
                "Mizoram", "IND", "IN31"));
        woeidMap.put("2345759", new Place(
                "Tripura", "IND", "IN26"));
        woeidMap.put("2345966", new Place(
                "Kangwon - do	", "PRK	", "KN09	"));
        woeidMap.put("2346165", new Place(
                "Hentiy", "MNG", "MG11"));
        woeidMap.put("2346157", new Place(
                "Arhangay", "MNG", "MG01"));
        woeidMap.put("2346164", new Place(
                "Govi - Altay", "MNG", "MG10"));
        woeidMap.put("2346173", new Place(
                "Uvs", "MNG", "MG19"));
        woeidMap.put("2346170", new Place(
                "Selenge", "MNG", "MG16"));
        woeidMap.put("2346160", new Place(
                "Dornod", "MNG", "MG06"));
        woeidMap.put("15021764", new Place(
                "Manawatu - Wanganui", "NZL", "NZF3"));
        woeidMap.put("2347375", new Place(
                "Rukwa", "TZA", "TZ24"));
        woeidMap.put("2347372", new Place(
                "Zanzibar South and Central", "TZA", "TZ21"));
        woeidMap.put("20069844", new Place(
                "Hardap", "NAM", "WA02"));
        woeidMap.put("2344975", new Place(
                "Pool", "COG", "CF11"));
        woeidMap.put("2344968", new Place(
                "Cuvette", "COG", "CF13"));
        woeidMap.put("2344969", new Place(
                "Kouilou", "COG", "CF04"));
        woeidMap.put("2344970", new Place(
                "Lékoumou", "COG", "CF05"));
        woeidMap.put("2344972", new Place(
                "Niari", "COG", "CF07"));
        woeidMap.put("2344973", new Place(
                "Plateaux", "COG", "CF08"));
        woeidMap.put("20069820", new Place(
                "Kavango", "NAM", "WA07"));
        woeidMap.put("20069834", new Place(
                "Caprivi", "NAM", "WA06"));
        woeidMap.put("2347370", new Place(
                "Kagera", "TZA", "TZ19"));
        woeidMap.put("2344900", new Place(
                "Bujumbura Mairie", "BDI", "BY24"));
        woeidMap.put("2344901", new Place(
                "Muramvya", "BDI", "BY22"));
        woeidMap.put("24550735", new Place(
                "Kamwenge", "UGA", "UG81"));
        woeidMap.put("2347364", new Place(
                "Kaskazini - Pemba", "TZA", "TZ13"));
        woeidMap.put("2347371", new Place(
                "Kusini - Pemba", "TZA", "TZ20"));
        woeidMap.put("2347353", new Place(
                "Pwani", "TZA", "TZ02"));
        woeidMap.put("2347376", new Place(
                "Zanzibar West", "TZA", "TZ25"));
        woeidMap.put("2347365", new Place(
                "Ruvuma", "TZA", "TZ14"));
        woeidMap.put("2347352", new Place(
                "Arusha", "TZA", "TZ26"));
        woeidMap.put("56025085", new Place(
                "Manyara", "TZA", "TZ06"));
        woeidMap.put("2347357", new Place(
                "Kilimanjaro", "TZA", "TZ06"));
        woeidMap.put("2347359", new Place(
                "Mara", "TZA", "TZ08"));
        woeidMap.put("2347369", new Place(
                "Tanga", "TZA", "TZ18"));
        woeidMap.put("15021761", new Place(
                "Gisborne", "NZL", "NZF1"));
        woeidMap.put("15021760", new Place(
                "Hawke 's Bay	", "	NZL	", "	NZF2	"));
        woeidMap.put("15021756", new Place(
                "Auckland", "NZL", "NZE7"));
        woeidMap.put("15021753", new Place(
                "Bay of Plenty", "NZL", "NZE8"));
        woeidMap.put("15021751", new Place(
                "Canterbury", "NZL", "NZE9"));
        woeidMap.put("15021759", new Place(
                "Marlborough", "NZL", "NZF4"));
        woeidMap.put("15021758", new Place(
                "Nelson", "NZL", ""));
        woeidMap.put("15021757", new Place(
                "Tasman", "NZL", "NZ00"));
        woeidMap.put("15021755", new Place(
                "Northland", "NZL", "NZF6"));
        woeidMap.put("15021763", new Place(
                "Taranaki", "NZL", "NZF9"));
        woeidMap.put("15021754", new Place(
                "Otago", "NZL", "NZF7"));
        woeidMap.put("15021750", new Place(
                "Southland", "NZL", "NZF8"));
        woeidMap.put("24554868", new Place(
                "Kent", "GBR", "UK24"));
        woeidMap.put("12578030", new Place(
                "Aragón", "ESP", "SP81"));
        woeidMap.put("2345266", new Place(
                "Monaghan", "IRL", ""));
        woeidMap.put("2344567", new Place(
                "Paktya", "AFG", "AF18"));
        woeidMap.put("20070332", new Place(
                "Chinmen", "TWN", ""));
        woeidMap.put("28362580", new Place(
                "Midtjylland", "DNK", ""));
        woeidMap.put("28362581", new Place(
                "Syddanmark", "DNK", ""));
        woeidMap.put("28362579", new Place(
                "Nordjylland", "DNK", ""));
        woeidMap.put("28362583", new Place(
                "Hovedstaden", "DNK", ""));
        woeidMap.put("28362582", new Place(
                "Sjaælland", "DNK", ""));
        woeidMap.put("2347105", new Place(
                "Vaud", "CHE", "SZ06"));
        woeidMap.put("2347085", new Place(
                "Basel - Landschaft", "CHE", "SZ05"));
        woeidMap.put("2347086", new Place(
                "Basel - Stadt", "CHE", "SZ03"));
        woeidMap.put("2347096", new Place(
                "Obwalden", "CHE", "SZ14"));
        woeidMap.put("20070562", new Place(
                "Västra Götaland", "SWE", " < Null >"));
        woeidMap.put("20070561", new Place(
                "Skåne", "SWE", "SW11"));
        woeidMap.put("55967002", new Place(
                "Savanes", "CIV", ""));
        woeidMap.put("56059374", new Place(
                "Labe", "GIN", ""));
        woeidMap.put("56059378", new Place(
                "Kankan", "GIN", ""));
        woeidMap.put("56059375", new Place(
                "Mamou", "GIN", ""));
        woeidMap.put("56059373", new Place(
                "Boke", "GIN", ""));
        woeidMap.put("56059377", new Place(
                "Kindia", "GIN", ""));
        woeidMap.put("55966993", new Place(
                "Denguélé", "CIV", "IV23"));
        woeidMap.put("56059376", new Place(
                "Nzerekore", "GIN", ""));
        woeidMap.put("56059379", new Place(
                "Faranah", "GIN", ""));
        woeidMap.put("55966992", new Place(
                "Bafing", "CIV", "IV26"));
        woeidMap.put("55966994", new Place(
                "Dix - Huit Montagnes", "CIV", "IV36"));
        woeidMap.put("56059372", new Place(
                "Conakry", "GIN", ""));
        woeidMap.put("55967006", new Place(
                "Worodougou", "CIV", "IV25"));
        woeidMap.put("55966998", new Place(
                "Marahoué", "CIV", "IV34"));
        woeidMap.put("55966995", new Place(
                "Fromager", "CIV", "IV18"));
        woeidMap.put("55966996", new Place(
                "Haut - Sassandra", "CIV", ""));
        woeidMap.put("55967003", new Place(
                "Sud - Bandama", "CIV", "IV29"));
        woeidMap.put("55967008", new Place(
                "Bas - Sassandra", "CIV", "IV32"));
        woeidMap.put("55967007", new Place(
                "Zanzan", "CIV", "IV11"));
        woeidMap.put("55967005", new Place(
                "Vallée du Bandama", "CIV", "IV20"));
        woeidMap.put("55966991", new Place(
                "Agnéby", "CIV", "IV06"));
        woeidMap.put("55967001", new Place(
                "N 'zi-Comoé	", "	CIV	", "	IV27	"));
        woeidMap.put("28358287", new Place(
                "Ngöbe Buglé", "PAN", "PM01"));
        woeidMap.put("28358286", new Place(
                "Emberá", "PAN", "PM05"));
        woeidMap.put("55967009", new Place(
                "Lagunes", "CIV", "IV61"));
        woeidMap.put("55966999", new Place(
                "Moyen - Cavally", "CIV", ""));
        woeidMap.put("55967000", new Place(
                "Moyen - Comoe", "CIV", ""));
        woeidMap.put("55966997", new Place(
                "Lacs", "CIV", "IV56"));
        woeidMap.put("55967004", new Place(
                "Sud - Comoé", "CIV", "IV63"));
        woeidMap.put("23424995", new Place(
                "Nicosia", "CYP", "CY04"));
        woeidMap.put("23424994", new Place(
                "Famagusta", "CYP", "CY01"));
        woeidMap.put("2347609", new Place(
                "Federal Capital Territory", "NGA", "NI11"));
        woeidMap.put("2345833", new Place(
                "Al - Anbar", "IRQ", "IZ01"));
        woeidMap.put("2345838", new Place(
                "Babil", "IRQ", "IZ06"));
        woeidMap.put("2347092", new Place(
                "Appenzell Innerrhoden", "CHE", "SZ10"));
        woeidMap.put("22525998", new Place(
                "Flemish Brabant", "BEL", ""));
        woeidMap.put("7153302", new Place(
                "Luxembourg", "BEL", ""));
        woeidMap.put("7153304", new Place(
                "East Flanders", "BEL", ""));
        woeidMap.put("7153305", new Place(
                "West Flanders", "BEL", ""));
        woeidMap.put("22525997", new Place(
                "Walloon Brabant", "BEL", ""));
        woeidMap.put("2346378", new Place(
                "Noord - Brabant", "NLD", "NL06"));
        woeidMap.put("2346383", new Place(
                "Zuid - Holland", "NLD", "NL11"));
        woeidMap.put("2346379", new Place(
                "Noord - Holland", "NLD", "NL07"));
        woeidMap.put("2345491", new Place(
                "Brandenburg", "DEU", "GM11"));
        woeidMap.put("2345492", new Place(
                "Mecklenburg - Vorpommern", "DEU", "GM12"));
        woeidMap.put("2345876", new Place(
                "Nagasaki", "JPN", "JA32"));
        woeidMap.put("2345867", new Place(
                "Kagoshima", "JPN", "JA18"));
        woeidMap.put("2345896", new Place(
                "Okinawa", "JPN", "JA40"));
        woeidMap.put("2345860", new Place(
                "Gunma", "JPN", "JA10"));
        woeidMap.put("20070460", new Place(
                "Daman and Diu", "IND", "IN32"));
        woeidMap.put("2344837", new Place(
                "Choiseul", "SLB", "BP11"));
        woeidMap.put("2344841", new Place(
                "Makira", "SLB", "BP08"));
        woeidMap.put("20070035", new Place(
                "`Adan", "YEM", "YM01"));
        woeidMap.put("20070036", new Place(
                "Abyan", "YEM", ""));
        woeidMap.put("2347580", new Place(
                "Massachusetts", "USA", "US25"));
        woeidMap.put("2347582", new Place(
                "Minnesota", "USA", "US32"));
        woeidMap.put("2347585", new Place(
                "Montana", "USA", "US30"));
        woeidMap.put("2347602", new Place(
                "North Dakota", "USA", "US38"));
        woeidMap.put("2347570", new Place(
                "Hawaii", "USA", "US15"));
        woeidMap.put("2347571", new Place(
                "Idaho", "USA", "US16"));
        woeidMap.put("2347606", new Place(
                "Washington", "USA", "US53"));
        woeidMap.put("2347561", new Place(
                "Arizona", "USA", "US04"));
        woeidMap.put("2347563", new Place(
                "California", "USA", "US06"));
        woeidMap.put("2347564", new Place(
                "Colorado", "USA", "US08"));
        woeidMap.put("2347587", new Place(
                "Nevada", "USA", "US32"));
        woeidMap.put("2347596", new Place(
                "Oregon", "USA", "US41"));
        woeidMap.put("2347603", new Place(
                "Utah", "USA", "US49"));
        woeidMap.put("2347609", new Place(
                "Wyoming", "USA", "US56"));
        woeidMap.put("2347562", new Place(
                "Arkansas", "USA", "US05"));
        woeidMap.put("2347574", new Place(
                "Iowa", "USA", "US19"));
        woeidMap.put("2347575", new Place(
                "Kansas", "USA", "US20"));
        woeidMap.put("2347584", new Place(
                "Missouri", "USA", "US29"));
        woeidMap.put("2347586", new Place(
                "Nebraska", "USA", "US31"));
        woeidMap.put("2347595", new Place(
                "Oklahoma", "USA", "US40"));
        woeidMap.put("2347602", new Place(
                "South Dakota", "USA", "US46"));
        woeidMap.put("2347577", new Place(
                "Louisiana", "USA", "US22"));
        woeidMap.put("2347602", new Place(
                "Texas", "USA", "US48"));
        woeidMap.put("2347565", new Place(
                "Connecticut", "USA", "US09"));
        woeidMap.put("2347572", new Place(
                "Rhode Island", "USA", "US44"));
        woeidMap.put("2347604", new Place(
                "Vermont", "USA", "US50"));
        woeidMap.put("2347559", new Place(
                "Alabama", "USA", "US01"));
        woeidMap.put("2347568", new Place(
                "Florida", "USA", "US12"));
        woeidMap.put("2347569", new Place(
                "Georgia", "USA", "US13"));
        woeidMap.put("2347583", new Place(
                "Mississippi", "USA", "US28"));
        woeidMap.put("2347592", new Place(
                "South Carolina", "USA", "US45"));
        woeidMap.put("2347572", new Place(
                "Illinois", "USA", "US17"));
        woeidMap.put("2347573", new Place(
                "Indiana", "USA", "US18"));
        woeidMap.put("2347576", new Place(
                "Kentucky", "USA", "US21"));
        woeidMap.put("2347592", new Place(
                "North Carolina", "USA", "US37"));
        woeidMap.put("2347594", new Place(
                "Ohio", "USA", "US39"));
        woeidMap.put("2347601", new Place(
                "Tennessee", "USA", "US47"));
        woeidMap.put("2347605", new Place(
                "Virginia", "USA", "US51"));
        woeidMap.put("2347608", new Place(
                "Wisconsin", "USA", "US55"));
        woeidMap.put("2347566", new Place(
                "Delaware", "USA", "US10"));
        woeidMap.put("2347567", new Place(
                "District of Columbia", "USA", "US11"));
        woeidMap.put("2347579", new Place(
                "Maryland", "USA", "US24"));
        woeidMap.put("2347572", new Place(
                "New York", "USA", "US36"));
        woeidMap.put("2347597", new Place(
                "Pennsylvania", "USA", "US42"));
        woeidMap.put("2347578", new Place(
                "Maine", "USA", "US23"));
        woeidMap.put("2347581", new Place(
                "Michigan", "USA", "US26"));
        woeidMap.put("2347560", new Place(
                "Alaska", "USA", "US02"));
        return woeidMap;
    }


}
