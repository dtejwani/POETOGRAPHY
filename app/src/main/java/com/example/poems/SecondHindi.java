package com.example.poems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class SecondHindi extends AppCompatActivity {
    int j;
    String [] HindiPoems= new String[]{"Aankho Ko Ashq Ka Pata Na Chalta,\n" +
            "Dil Ko Dard Ka Ehsaas Na Hota,\n" +
            "Kitna Haseen Hota Zindagi Ka Safar,\n" +
            "Agar Milkar Kabhi Bchadna Na Hota.","Dard Kaisa Bhi Ho Aankh Nam Na Karo,\n" +
            "Raat Kaali Sahi Lekin Gham Na Karo,\n" +
            "Ek Sitara Ban Jagmagate Raho,\n" +
            "Zindagi Me Yun Hi Sada Muskurate Raho.","जिंदगी के राज़ को राज़ रहने दो,\n" +
            "अगर है कोई ऐतराज़ तो रहने दो,\n" +
            "पर जब दिल करे हमें याद करने को,\n" +
            "तो उसे ये मत कहना के आज रहने दो।","ज़िन्दगी की हर सुबह कुछ शर्ते ले कर आती है,\n" +
            "ज़िन्दगी की हर शाम कुछ तजुर्बे दे कर जाती है।","है अजीब शहर की ज़िन्दगी\n" +
            "न सफ़र रहा न कयाम है,\n" +
            "कहीं कारोबार सी दोपहर\n" +
            "कहीं बाद मिजाज सी शाम है।","Ahista Chal Ai Zindagi\n" +
            "Kuch Karz Chukane Hain,\n" +
            "Kuch Ke Dard Mitane Baki Hain,\n" +
            "Kuch Farz Nibhane Baki Hain.","Pareshan Hun Main Aur Dard Ka Hai Naam Zindagi,\n" +
            "Achchha Ya Bura Main Hun Par Badnaam Zindagi.\n" +
            "Syah Raatein, Mayusi, Aansu, Lachari, Tanhayi,\n" +
            "Mohabbat De Ya Kar Maut Ka Intezam Zindagi.","ज़िन्दगी से बस यही गिला है,\n" +
            "ख़ुशी के बाद क्यों ये गम मिला है,\n" +
            "हमने तो उनसे वफ़ा की थी,\n" +
            "पर नहीं जानते थे कि बेवफाई ही वफ़ा का सिला है।","जो लम्हा साथ है उसे जी भर के जी लेना,\n" +
            "ये कमबख्त ज़िन्दगी भरोसे के काबिल नहीं है।","लोग डूबते हैं तो समंदर को दोष देते हैं, \n" +
            "मंजिल न मिले तो मुकद्दर को दोष देते हैं, \n" +
            "खुद तो संभल कर चल नहीं सकते लोग, \n" +
            "जब ठोकर लगती है तो पत्थर को दोष देते हैं।","देखा है ज़िंदगी को कुछ इतने क़रीब से,\n" +
            "चेहरे तमाम लगने लगे हैं अजीब से।\n" +
            "\n" +
            "जो पढ़ा है उसे जीना ही नहीं है मुमकिन,\n" +
            "ज़िंदगी को मैं किताबों से अलग रखता हूँ।","हजारों उलझनें राहों में और कोशिशें बेहिसाब,\n" +
            "इसी का नाम है ज़िन्दगी चलते रहिये जनाब।\n" +
            "\n" +
            "धूप में निकलो घटाओं में नहा कर देखो,\n" +
            "ज़िंदगी क्या है किताबों को हटा कर देखो।","जिंदगी बहुत खूबसूरत है, जिंदगी से प्यार करो,\n" +
            "अगर हो रात तो, सुबह का इंतजार करो,\n" +
            "वो पल भी आएगा जिसका तुझे इंतेज़ार है,\n" +
            "बस उस खुदा पर भरोसा और वक्त पर ऐतवार करो।"+"जिंदगी में जीत और हार है किसके लिए,\n" +
            "एक दूसरे में इतनी तकरार है किसके लिए,\n" +
            "जो आया है इस दुनिया मे एक दिन वो जाएगा,\n" +
            "ए इंसा तो तुझे इतना गुमान है किसके लिए।\n" +
            "\n","ज़िन्दगी तस्वीर भी है और तक़दीर भी,\n" +
            "फर्क तो सिर्फ रंगों का है।\n" +
            "मनचाहे रंगों से बने तो तस्वीर, और\n" +
            "अनजाने रंगों से बने तो तक़दीर।"
            ,"Na Sath Hai Kisi Ka Na Sahara Hai Koi\n" +
                    "Na Ham Hain Kisi Ke Na Hmara Hai Koi", "Phir se tere mehfil mein chala aya hu\n" +
            "Andaz wahi h bs alfaz naye laya hu\n" +
            "er kasz", "Chehre ki hasi se har gam chupao\n" +
            "Bahut kuchh bolo par kuchh na batao\n" +
            "Khud na rutho kabhi par sabko manao\n" +
            "Ye raz hai zindagi ka, bas jeete jao","Door rehne wale terko ek bat kehna chahta hu,\n" +
            "agar mera khyal aaye to apna khyal rakhna", " Saza hume ye kaisi mili dil lagane ki\n" +
            "Ro rahe magar tamnna thi muskurane ki\n" +
            "Apna dard kise dikhau aye dost\n" +
            "Dard bhi usine diya jo wajah thi muskurane ki", "Pyar mein kisi ko khona bhi zindagi hai\n" +
            "Zindagi mein ghamo ka hona bhi zindagi hai\n" +
            "Yuh toh rehte hai hamare hontho par muskurahat\n" +
            "Par chupke se kisi ke liye rona bhi zindagi hai", "ये झूठ है के मुहब्बत किसी का दिल तोड़ती है\n" +
            "लोग खुद ही टुट जाते है मुहब्बत करते-करते", "Yaad karte hai tumhe tanhai me\n" +
            "Dil duba hai gamo ki gehrai me\n" +
            "Hume mat dhundna duniya ki bhid me\n" +
            "Hum milenge tumhe tumhari hi parchai me", "Girte rahe hum sajdo me hasrat e ishQ ki khaatir\n" +
            "agar ibadat e khuda me gire hote to zindgi jannat ban jati","Gulaami toh sirf tere ISHQ ki thi Baaki ye dil\n" +
            "Pehele b NAWAB tha or Aaj b hai\n" +
            "Er kasz", "Hamari Dastan Use Kaha Kabul Thi\n" +
            "Meri Wafayen Uske Liye Fizool Thi\n" +
            "Koi Aas Nahi Lekin Itna Bata Do\n" +
            "Maine Chaha Use Kya Ye Meri Bhool thi", "Woh humsey apni marzi se baat krtey hai\n" +
            "aur hum bhi kitney pagal hai ke unki marji ka intezar kartey hai", "Tumhein maloom bhi hai main tanha jee nahin sakta\n" +
            "Meri aadat badalne tak to mere saath ruk jao","Phir wohi raat wohi hum wohi tanhaai hai\n" +
            "Phir har ik chott mohabbat ki ubhar aayi hai", "Phool Dekhte They Janaze pe Hamesha\n" +
            "Kal Meri Aankhon Ne Phoolon Ke Janaze Dekhein\n" +
            "Er kasz","Bahut Dur Magar Bahut Paas Rehte Ho\n" +
            "Aankhon Se Dur Magar Dil Ke Paas Rehte Ho\n" +
            "Mujhe Bas Itna Bataa Do Ae Dost\n" +
            "Kya Tum Bhi Mere Bina Udaas Rehte Ho", "Main ek khilona hu aur wo uss bachhe ki tarah hai\n" +
            "jisse mujhse pyaar to hai lekin sirf khelne ki hadd tak","Tanha Rehna To Sikh Liya Humne\n" +
            "Per Khush Na Kabhi Reh Payenge\n" +
            "Teri Duri To Pir Bhi Seh Leta Hai Ye Dil\n" +
            "Per Teri Mohabbat Ke Bin Na Jee Payenge","Na Hawas Us K Jism Ki Na Shoq Uski Lazzat Ka\n" +
            "Bin Matlabi Sa Banda Hoon Uski Saadgi per Marta Hu", "Kal raat tanhaa chand ko dekha tha mene khawb mein Mohsin\n" +
            "mujhe raas aaye gi shayed sadaa awaargi", "Dil ki khwahish ko naam kya dun\n" +
            "pyar ka use paigam kya dun\n" +
            "Is dil me dard nahi yaaden hai uski\n" +
            "ab yaaden hi mujhe dard de to use ilzam kya dun","kon kehta he duri se mit jaati he mohabbat\n" +
            "Milne waale to khayaalo me bhi mila karte he", "Jee Toh Chahta Hai Tujhe Cheer Ke Rakh Doon Ae Dil\n" +
            "Na Woh Rahe Tujhme Na Tu Rahe Mujh Mein", "Tere Pyaar Ki Hifazat Kuch Isssss Tarha Se Ki Humne\n" +
            "Jab Kbhi Kisi Ne Pyar Se Dekha To Nazre Jhuka Li Humne","Jin Ke Paas Hoti Hain Umer Bhar Ki Yadain\n" +
            "Woh Log Tanhai Mein Bhi Tanha Nahi Hotay", "Jaao Dhond Lo Hum Se Ziyada Chahne Wala\n" +
            "Mil Jaye To Khush Rehna Na Mile To Hum Phir Bhi Tumhare Hai\n" +
            "Er kasz","Wo is chah me rehte hai ki hum unko unse hi mange\n" +
            "hum is gurur me rehte hai ki hum apni hi cheez ku mange"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_hindi);
        final TextView hintry=findViewById(R.id.hintry);
        hintry.setText(HindiPoems[0]);
        j=0;
        Button nextShayri= findViewById(R.id.nextShayri);
        nextShayri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j++;
                if(j==41){j=0;}
                hintry.setText(HindiPoems[j]);
            }
        });
        Button previousShayri= findViewById(R.id.previousShayri);
        previousShayri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j--;
                if(j==-1){j=40;}
                hintry.setText(HindiPoems[j]);
            }
        });
        Button home_fromHindi= findViewById(R.id.home_fromHindi);
        home_fromHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getHomefromHin= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(getHomefromHin);
            }
        });

    }
}
