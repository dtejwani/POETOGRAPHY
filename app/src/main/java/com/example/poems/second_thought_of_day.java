package com.example.poems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class second_thought_of_day extends AppCompatActivity {
    String [] thoughtstext= new String[]{
           "“A day wasted on others is not wasted on one’s self.”\n" +
                   "– Charles Dickens\n","“I slept and I dreamed that life is all joy. I woke and I saw that life is all service. I served and I saw that service is joy.”\n" +
            "– Kahlil Gibran","“When you are able to shift your inner awareness to how you can serve others, and when you make this the central focus of your life, you will then be in a position to know true miracles in your progress toward prosperity.”\n" +
            "– Wayne Dyer","“Practice kindness all day to everybody and you will realize you’re already in heaven now.”\n" +
            "– Jack Kerouac","“Love only grows by sharing. You can only have more for yourself by giving it away to others.”\n" +
            "– Brian Tracy","“Let us try to teach generosity and altruism, because we are born selfish. Let us understand what our own selfish genes are up to, because we may then at least have the chance to upset their designs, something that no other species has ever aspired to do.”\n" +
            "– Richard Dawkins","“My religion is very simple. My religion is kindness.”\n" +
            "– Dalai Lama XIV","“Kindness is a source of relief to the soul of the giver, creating a sense of fortitude that is incomprehensible to those who do not know what kindness is all about.”\n" +
            "– Janvier Chouteu-Chando","“One who knows how to show and to accept kindness will be a friend better than any possession.”\n","“Beginning today, treat everyone you meet as if they were going to be dead by midnight. Extend to them all the care, kindness and understanding you can muster, and do it with no thought of any reward. Your life will never be the same again.”\n" +
            "– Og Mandingo","“When I was young, I used to admire intelligent people; as I grow older, I admire kind people.”\n" +
            "– Abraham Joshua Heschel","“Be careful what you water your dreams with. Water them with worry and fear and you will produce weeds that choke the life from your dream. Water them with optimism and solutions and you will cultivate success. Always be on the lookout for ways to nurture your dream.”\n" +
            "– Lao Tzu\n","“You get older and you learn there is one sentence, just four words long, and if you can say it to yourself it offers more comfort than almost any other. It goes like this: At least I tried.”\n" +
            "– Ann Brashares","“I found that every single successful person I’ve ever spoken to had a turning point and the turning point was where they made a clear, specific, unequivocal decision that they were not going to live like this anymore. Some people make that decision at 15 and some people make it at 50 and most never make it at all.”\n" +
            "– Brian Tracy","“Life is really generous to those who pursue their personal legend.”\n" +
            "– Paulo Coelho","“You have to chase your dreams, no matter what. The impossible just takes a little longer. One stroke at a time, one step at a time, the impossible is easy to achieve.”\n" +
            "– Tori Murden","“Don’t keep your dreams in your eyes, they may fall as tears. Keep them in your heart so that every heartbeat may remind you to convert them into reality.”\n" +
            "– Nishan Panway","“You can influence, direct and control your own environment. You can make your life what you want it to be.”\n" +
            "– Napoleon Hill","“Change your life today. Don’t gamble on the future, act now, without delay.”\n" +
            "– Simone de Beauvoir","“The only person you are destined to become is the person you decide to be.”\n" +
            "– Ralph Waldo Emerson","“No one is in control of your happiness but you; therefore, you have the power to change anything about yourself or your life that you want to change.”\n" +
            "– Barbara de Angelis\n","“Control your thoughts. Decide about that which you will think and concentrate upon. You are in charge of your life to the degree you take charge of your thoughts.”\n" +
            "– Earl Nightingale\n","“Don’t settle. Don’t finish crappy books. If you don’t like the menu, leave the restaurant. If you’re not on the right path, get off it.”\n" +
            "– Chris Brogan","“Don’t bend; don’t water it down; don’t try to make it logical; don’t edit your own soul according to the fashion. Rather, follow your most intense obsessions mercilessly.”\n" +
            "– Franz Kafka","“Conquer the angry one by not getting angry; conquer the wicked by goodness; conquer the stingy by generosity, and the liar by speaking the truth.”\n" +
            "– Gautama Buddha","“Our biggest fear is not in expressing the truth but that we will be attacked or belittled because of our truth.”\n" +
            "– Kelli Wilson","“I refuse to accept the view that mankind is so tragically bound to the starless midnight of racism and war that the bright daybreak of peace and brotherhood can never become a reality…I believe that unarmed truth and unconditional love will have the final word.”\n" +
            "– Martin Luther King Jr.","“In essence, you are neither inferior nor superior to anyone. True self-esteem and true humility arise out of that realization. In the eyes of the ego, self-esteem and humility are contradictory. In truth, they are one and the same.” – Eckhart Tolle","“The ideals which have always shone before me and filled me with joy are goodness, beauty, and truth.” – Albert Einstein","My religion is based on truth and non-violence. Truth is my God. Non-violence is the means of realising Him. Mahatma Gandhi\n"
            ,"Live as if you were to die tomorrow. Learn as if you were to live forever. Mahatma Gandhi\n" ,"The difference between what we do and what we are capable of doing would suffice to solve most of the world's problems. Mahatma Gandhi\n"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_thought_of_day);

        Random random = new Random();
        int randomInteger = random.nextInt(32);
        TextView textThought=findViewById(R.id.textThought);
        textThought.setText(thoughtstext[randomInteger]);
        Button HomefromThought= findViewById(R.id.HomefromThought);
        HomefromThought.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_fromThought= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home_fromThought);
            }
        });


    }
}
