package Utilities;

import java.util.ArrayList;

import Models.Restaurant;

public class DataManager {

    public static ArrayList<Restaurant> restaurants = null;
    public static ArrayList<Restaurant> getRestaurants() {
        if (restaurants != null) {
            return restaurants;
        }
        restaurants = new ArrayList<>();

        restaurants.add(new Restaurant()
                .setName("The Showroom Bakehouse")
                .setNumber(036414123)
                .setImage("https://www.hadbarot.net/wp-content/uploads/2023/02/siteNewLogo14318020.png")
                .setAddress("Levitan 4, Tel-aviv ")
                .setRating(86)
                .setReviews(194)
        );

        restaurants.add(new Restaurant()
                .setName("Bordel")
                .setNumber(037424233)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRIaJi1ZVwg62jlZ0DQYuktTws1nUuqgQrLw&usqp=CAU")
                .setAddress("Nahalat Binyamin 52, Tel-Aviv")
                .setRating(55)
                .setReviews(82)
        );
        restaurants.add(new Restaurant()
                .setName("M25")
                .setNumber(03640011)
                .setImage("https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b2cd8169624331.5b87b555bf8d5.jpeg")
                .setAddress("Aba Even 2, Herzliya ")
                .setRating(80)
                .setReviews(307)
        );
        restaurants.add(new Restaurant()
                .setName("Herbert Samuel")
                .setNumber(03640011)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzc6bM2B_WsDvTur2HfEYppkceaoW6n4eTvA&usqp=CAU")
                .setAddress("Hagiborim 8, Rishon Le Zion")
                .setRating(72)
                .setReviews(219)
        );
        restaurants.add(new Restaurant()
                .setName("Magdalena")
                .setNumber(026412007)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmz-iWhZhDFRj0I_oVAapljuCM5shc7SQ5aw&usqp=CAU")
                .setAddress("Magdalena - Ein Kerem, Jerusalem")
                .setRating(83)
                .setReviews(307)
        );
        restaurants.add(new Restaurant()
                .setName("Uri Buri")
                .setNumber(073151721)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTarMi1isyi4tqM3APx2EWwDRQvE46bsuQz5Q&usqp=CAU")
                .setAddress("Uri Buri - HaHagana St, Acre")
                .setRating(87)
                .setReviews(407)
        );
        restaurants.add(new Restaurant()
                .setName("Roberg")
                .setNumber(043440210)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQGOnsoR1HoQ9g-rMwt19w7fztCPFiTocY91Q&usqp=CAU")
                .setAddress("Hanamal 107, Haifa")
                .setRating(67)
                .setReviews(219)
        );
        restaurants.add(new Restaurant()
                .setName("Hachatzer")
                .setNumber(02504315)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvyhGYD_Tjo-5j4Z909u0r4VJ8ytb5h_kJ9w&usqp=CAU")
                .setAddress("Ein Hod, Carmel Mountains")
                .setRating(82)
                .setReviews(488)
        );
        restaurants.add(new Restaurant()
                .setName("Kukuriku")
                .setNumber(024205500)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsSpwHgWqZcAXDFmYZSi05V2TvfuyAMu60Hw&usqp=CAU")
                .setAddress("Pal-Yam 17, Haifa")
                .setRating(63)
                .setReviews(280)
        );
        restaurants.add(new Restaurant()
                .setName("Tishbi")
                .setNumber(053127013)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZdNMuwU35VeNk5I93DHNvTAXenDhKpLu_oA&usqp=CAU")
                .setAddress("Derech HaTishbi 4, Binyamina")
                .setRating(76)
                .setReviews(412)
        );
        restaurants.add(new Restaurant()
                .setName("Salta Bagdad")
                .setNumber(053127013)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSTWQfG7zmkZUH_0iYTbt7n1dM1tvsdHWtvQ&usqp=CAU")
                .setAddress("Haazmaut 18, Beer Sheva")
                .setRating(70)
                .setReviews(402)
        );
        restaurants.add(new Restaurant()
                .setName("McDonald's")
                .setNumber(036414231)
                .setImage("https://image.cnbcfm.com/api/v1/image/107180422-1674061950534-gettyimages-1285446341-dsc_2675_20201113110927535.jpeg?v=1680474077&w=929&h=523&vtcrop=y")
                .setAddress("Eliahu Hakim 5, Tel-Aviv")
                .setRating(86)
                .setReviews(275)
        );

        restaurants.add(new Restaurant()
                .setName("GDB")
                .setNumber(036212420)
                .setImage("https://atmo.ams3.cdn.digitaloceanspaces.com/newimgs/SfMW5zzakmfnNsllgsRAqMLPCLwuJuo95zMiWped.jpg")
                .setAddress("Ibn-Gabirol 52, Tel-Aviv")
                .setRating(88)
                .setReviews(274)
        );

        restaurants.add(new Restaurant()
                .setName("Barkan")
                .setNumber(036232420)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0CJqpiIRCxM1csSq8fFFP9AW9bz-JhPnqxQ&usqp=CAU")
                .setAddress("Ben-Yehuda 78, Tel-Aviv")
                .setRating(65)
                .setReviews(211)
        );

        restaurants.add(new Restaurant()
                .setName("Le-or")
                .setNumber(036211020)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ7JL1J03sXwt2liJuADEvjQ8rcOtoiBFQCQ&usqp=CAU")
                .setAddress("Rothschild Blvd 12, Tel-Aviv")
                .setRating(66)
                .setReviews(179)
        );

        restaurants.add(new Restaurant()
                .setName("Grand Cafe")
                .setNumber(037412244)
                .setImage("data:image/png;base64,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")
                .setAddress("Einstein 40, Tel-Aviv")
                .setRating(81)
                .setReviews(421)
        );

        restaurants.add(new Restaurant()
                .setName("Milka")
                .setNumber(036142375)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBrFH7FFmJF24O-Kr9CaNxzexwcvosySm6sg&usqp=CAU")
                .setAddress("Sderot Rokach 5, Tel-Aviv")
                .setRating(68)
                .setReviews(128)
        );
        restaurants.add(new Restaurant()
                .setName("Aubergine")
                .setNumber(026032125)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkE0wxQi0u_rBsv1gKGezmF5pD_myYiMImsg&usqp=CAU")
                .setAddress("Nahalal 14, Kfar Tavor")
                .setRating(71)
                .setReviews(212)
        );
        restaurants.add(new Restaurant()
                .setName("1868")
                .setNumber(016142375)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlu9QUdUVtLHWYc6OEVVejTrdlzNGCzU_WOw&usqp=CAU")
                .setAddress("Nablus Rd, Ramallah")
                .setRating(57)
                .setReviews(363)
        );
        restaurants.add(new Restaurant()
                .setName("Barbunia")
                .setNumber(034102231)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9PJkyHqr-MbimGZu4V-GjuuzNa6bzBSRufw&usqp=CAU")
                .setAddress("Beit Eshel 7, Jaffa")
                .setRating(79)
                .setReviews(501)
        );

        restaurants.add(new Restaurant()
                .setName("Aroma")
                .setNumber(036112231)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqeCPpJiTQ8QHEBFNeXVeLGIuPjOmvO-qH2w&usqp=CAU")
                .setAddress("Yordei Hasira 119, Tel-Aviv")
                .setRating(70)
                .setReviews(415)
        );

        restaurants.add(new Restaurant()
                .setName("Port said")
                .setNumber(036102311)
                .setImage("https://fruitfortheoffice.co.uk/pub/media/catalog/product/cache/118fd06640efc949eafa2123c39b08e3/i/s/istockphoto-466175630-612x612.jpg")
                .setAddress("Har Sinai 5, Tel-Aviv")
                .setRating(81)
                .setReviews(379)
        );

        restaurants.add(new Restaurant()
                .setName("Taizu")
                .setNumber(036012231)
                .setImage("data:image/png;base64,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")
                .setAddress("Ibn Gabirol 18, Tel-Aviv")
                .setRating(88)
                .setReviews(315)
        );

        restaurants.add(new Restaurant()
                .setName("Hakosem")
                .setNumber(035412212)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwIEIqpcVCBRpffrqc3P5JvGKIjjnRU0KpxQ&usqp=CAU")
                .setAddress("Shlomo Ha-Melech 1, Tel-Aviv")
                .setRating(75)
                .setReviews(293)
        );

        restaurants.add(new Restaurant()
                .setName("Shila")
                .setNumber(036132231)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRUK9n4E65XlweQqGq0AxTKtZnY_RXivhnsDQ&usqp=CAU")
                .setAddress("Ha-Arba'a 3, Tel-Aviv")
                .setRating(79)
                .setReviews(412)
        );

        restaurants.add(new Restaurant()
                .setName("Benedict")
                .setNumber(036331213)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYgNAXwnp8NmyG9P3KrYMxIXeZhUxTlxjOvw&usqp=CAU")
                .setAddress("Rothschild Blvd 29, Tel-aviv ")
                .setRating(63)
                .setReviews(280)
        );
        restaurants.add(new Restaurant()
                .setName("Teder")
                .setNumber(037427412)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSBpArpYNRirpiEkvCP1JIEkiGPXexNccXzQ&usqp=CAU")
                .setAddress("Derech Jaffa 9, Tel-aviv ")
                .setRating(71)
                .setReviews(319)
        );
        restaurants.add(new Restaurant()
                .setName("Cafe Xoho")
                .setNumber(036411523)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIR1UtDZQ9OtIz8rgLkxEUvBrgZDDIEJ6iUA&usqp=CAU")
                .setAddress("Ben yehuda 73, Tel-aviv ")
                .setRating(57)
                .setReviews(275)
        );
        restaurants.add(new Restaurant()
                .setName("Bana")
                .setNumber(036417723)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWWUP-EFM61pmnf_gIRUHYddsttMVMMUB0_A&usqp=CAU")
                .setAddress("Nachmani 19, Tel-aviv ")
                .setRating(68)
                .setReviews(396)
        );
        restaurants.add(new Restaurant()
                .setName("Claro")
                .setNumber(037414213)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2z2lue_cvQmyUetQgSbxo2bqj7k6_6rhbdQ&usqp=CAU")
                .setAddress("Hata'arucha 23, Tel-aviv ")
                .setRating(81)
                .setReviews(203)
        );
        restaurants.add(new Restaurant()
                .setName("Santa Caterina")
                .setNumber(037410021)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTc5zY-CocV2L4zLL4-pzPY30Bc6jjyU4WV7w&usqp=CAU")
                .setAddress("Har Sinai 2, Tel-aviv ")
                .setRating(83)
                .setReviews(407)
        );
        restaurants.add(new Restaurant()
                .setName("Falafel Gabay")
                .setNumber(036410012)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQbwNZGxUAHJDWxOlqogQEQIDaz__puI7dZA&usqp=CAU")
                .setAddress("King George 19, Tel-aviv ")
                .setRating(62)
                .setReviews(288)
        );
        restaurants.add(new Restaurant()
                .setName("North Abraxas")
                .setNumber(036422033)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTlOEcdVNGrozHyTW-gE7nUdQuyCb58ccgtow&usqp=CAU")
                .setAddress("Lillenblum 40, Tel-aviv ")
                .setRating(69)
                .setReviews(311)
        );
        restaurants.add(new Restaurant()
                .setName("Dixie")
                .setNumber(036103132)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLsGg8bKpU3ugdxW2QioDDahYEEe8xsVgHxA&usqp=CAU")
                .setAddress("Rothschild Blvd 31, Tel-aviv ")
                .setRating(70)
                .setReviews(294)
        );
        restaurants.add(new Restaurant()
                .setName("Tzidkiyahu")
                .setNumber(026027017)
                .setImage("https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b2cd8169624331.5b87b555bf8d5.jpeg")
                .setAddress("HaMeyasdim 13, Zichron Ya'akov")
                .setRating(78)
                .setReviews(396)
        );
        restaurants.add(new Restaurant()
                .setName("Ouzeria")
                .setNumber(036024123)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSj0WaCWZDxg2Mv-1lUAAi1zLo96JgU0JlZow&usqp=CAU")
                .setAddress("Maze 19, Tel-aviv ")
                .setRating(59)
                .setReviews(201)
        );
        restaurants.add(new Restaurant()
                .setName("Kitchen Market")
                .setNumber(037024123)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR729DajXkDSiqMcJhGKmOx-rlg0gA9pudejA&usqp=CAU")
                .setAddress("HaArba'a St 12, Tel-aviv ")
                .setRating(70)
                .setReviews(392)
        );
        restaurants.add(new Restaurant()
                .setName("Catit")
                .setNumber(037004023)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQvD5sTyZir0uyh9q67W2ZSyy9tsUvA1Ow9Sg&usqp=CAU")
                .setAddress("Nahmani St 4, Tel-aviv ")
                .setRating(80)
                .setReviews(314)
        );
        restaurants.add(new Restaurant()
                .setName("Saluf & Sons")
                .setNumber(036102003)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmyLMUiYQhTABfK2Dzg-_ckmMCDM91ODDWSg&usqp=CAU")
                .setAddress("Shlomo Hamelech 8, Tel-aviv ")
                .setRating(67)
                .setReviews(211)
        );
        restaurants.add(new Restaurant()
                .setName("HaBasta")
                .setNumber(036304103)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRm_VYvkwmbgSpInyx_bxVSZC4adonX7d5csQ&usqp=CAU")
                .setAddress("HaShomer St 4, Tel-aviv ")
                .setRating(81)
                .setReviews(403)
        );
        restaurants.add(new Restaurant()
                .setName("Blue Sky")
                .setNumber(03640011)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtzOWfPpwYS18VmuO3uODfOWmNApHWSP_iXg&usqp=CAU")
                .setAddress("Menachem Begin Rd 3, Tel-aviv ")
                .setRating(82)
                .setReviews(309)
        );
        restaurants.add(new Restaurant()
                .setName("Popina")
                .setNumber(03640011)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGRdqEgF7NvGvlXbH5w9Gf1Zrax45UMvm8tQ&usqp=CAU")
                .setAddress("Ibn Gabirol 27, Tel-aviv ")
                .setRating(72)
                .setReviews(419)
        );

        return restaurants;
    }
}
