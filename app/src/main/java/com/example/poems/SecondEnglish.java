package com.example.poems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class SecondEnglish extends AppCompatActivity {
    int i;
    String [] EnglishPoems = new String[]{
            "Phenomenal Woman by Maya Angelou\n" +
                    "Pretty women wonder where my secret lies.\n" +
                    "I'm not cute or built to suit a fashion model's size\n" +
                    "But when I start to tell them,\n" +
                    "They think I'm telling lies.\n" +
                    "I say,\n" +
                    "It's in the reach of my arms\n" +
                    "The span of my hips,\n" +
                    "The stride of my step,\n" +
                    "The curl of my lips.\n" +
                    "I'm a woman\n" +
                    "Phenomenally.\n" +
                    "Phenomenal woman,\n" +
                    "That's me.\n" +
                    "\n" +
                    "I walk into a room\n" +
                    "Just as cool as you please,\n" +
                    "And to a man,\n" +
                    "The fellows stand or\n" +
                    "Fall down on their knees.\n" +
                    "Then they swarm around me,\n" +
                    "A hive of honey bees.\n" +
                    "I say,\n" +
                    "It's the fire in my eyes,\n" +
                    "And the flash of my teeth,\n" +
                    "The swing in my waist,\n" +
                    "And the joy in my feet.\n" +
                    "I'm a woman\n" +
                    "Phenomenally.\n" +
                    "Phenomenal woman,\n" +
                    "That's me.\n" +
                    "\n" +
                    "Men themselves have wondered\n" +
                    "What they see in me.\n" +
                    "They try so much\n" +
                    "But they can't touch\n" +
                    "My inner mystery.\n" +
                    "When I try to show them\n" +
                    "They say they still can't see.\n" +
                    "I say,\n" +
                    "It's in the arch of my back,\n" +
                    "The sun of my smile,\n" +
                    "The ride of my breasts,\n" +
                    "The grace of my style.\n" +
                    "I'm a woman\n" +
                    "\n" +
                    "Phenomenally.\n" +
                    "Phenomenal woman,\n" +
                    "That's me.\n" +
                    "\n" +
                    "Now you understand\n" +
                    "Just why my head's not bowed.\n" +
                    "I don't shout or jump about\n" +
                    "Or have to talk real loud.\n" +
                    "When you see me passing\n" +
                    "It ought to make you proud.\n" +
                    "I say,\n" +
                    "It's in the click of my heels,\n" +
                    "The bend of my hair,\n" +
                    "the palm of my hand,\n" +
                    "The need of my care,\n" +
                    "'Cause I'm a woman\n" +
                    "Phenomenally.\n" +
                    "Phenomenal woman,\n" +
                    "That's me.\n",
            "Where the Sidewalk Ends by Shel Silverstein\n" +
            "There is a place where the sidewalk ends\n" +
            "And before the street begins,\n" +
            "And there the grass grows soft and white,\n" +
            "And there the sun burns crimson bright,\n" +
            "And there the moon-bird rests from his flight\n" +
            "To cool in the peppermint wind.\n" +
            "\n" +
            "Let us leave this place where the smoke blows black\n" +
            "And the dark street winds and bends.\n" +
            "Past the pits where the asphalt flowers grow\n" +
            "We shall walk with a walk that is measured and slow,\n" +
            "And watch where the chalk-white arrows go\n" +
            "To the place where the sidewalk ends.\n" +
            "\n" +
            "Yes we'll walk with a walk that is measured and slow,\n" +
            "And we'll go where the chalk-white arrows go,\n" +
            "For the children, they mark, and the children, they know\n" +
            "The place where the sidewalk ends.","If You Forget Me by Pablo Neruda\n" +
            "I want you to know\n" +
            "one thing.\n" +
            "\n" +
            "You know how this is:\n" +
            "if I look\n" +
            "at the crystal moon, at the red branch\n" +
            "of the slow autumn at my window,\n" +
            "if I touch\n" +
            "near the fire\n" +
            "the impalpable ash\n" +
            "or the wrinkled body of the log,\n" +
            "everything carries me to you,\n" +
            "as if everything that exists,\n" +
            "aromas, light, metals,\n" +
            "were little boats\n" +
            "that sail\n" +
            "toward those isles of yours that wait for me.\n" +
            "\n" +
            "Well, now,\n" +
            "if little by little you stop loving me\n" +
            "I shall stop loving you little by little.\n" +
            "\n" +
            "If suddenly\n" +
            "you forget me\n" +
            "do not look for me,\n" +
            "for I shall already have forgotten you.\n" +
            "\n" +
            "If you think it long and mad,\n" +
            "the wind of banners\n" +
            "that passes through my life,\n" +
            "and you decide\n" +
            "to leave me at the shore\n" +
            "of the heart where I have roots,\n" +
            "remember\n" +
            "that on that day,\n" +
            "at that hour,\n" +
            "I shall lift my arms\n" +
            "and my roots will set off\n" +
            "to seek another land.\n" +
            "\n" +
            "But\n" +
            "if each day,\n" +
            "each hour,\n" +
            "you feel that you are destined for me\n" +
            "with implacable sweetness,\n" +
            "if each day a flower\n" +
            "climbs up to your lips to seek me,\n" +
            "ah my love, ah my own,\n" +
            "in me all that fire is repeated,\n" +
            "in me nothing is extinguished or forgotten,\n" +
            "my love feeds on your love, beloved,\n" +
            "and as long as you live it will be in your arms\n" +
            "without leaving mine","If You Forget Me by Pablo Neruda\n" +
            "I want you to know\n" +
            "one thing.\n" +
            "\n" +
            "You know how this is:\n" +
            "if I look\n" +
            "at the crystal moon, at the red branch\n" +
            "of the slow autumn at my window,\n" +
            "if I touch\n" +
            "near the fire\n" +
            "the impalpable ash\n" +
            "or the wrinkled body of the log,\n" +
            "everything carries me to you,\n" +
            "as if everything that exists,\n" +
            "aromas, light, metals,\n" +
            "were little boats\n" +
            "that sail\n" +
            "toward those isles of yours that wait for me.\n" +
            "\n" +
            "Well, now,\n" +
            "if little by little you stop loving me\n" +
            "I shall stop loving you little by little.\n" +
            "\n" +
            "If suddenly\n" +
            "you forget me\n" +
            "do not look for me,\n" +
            "for I shall already have forgotten you.\n" +
            "\n" +
            "If you think it long and mad,\n" +
            "the wind of banners\n" +
            "that passes through my life,\n" +
            "and you decide\n" +
            "to leave me at the shore\n" +
            "of the heart where I have roots,\n" +
            "remember\n" +
            "that on that day,\n" +
            "at that hour,\n" +
            "I shall lift my arms\n" +
            "and my roots will set off\n" +
            "to seek another land.\n" +
            "\n" +
            "But\n" +
            "if each day,\n" +
            "each hour,\n" +
            "you feel that you are destined for me\n" +
            "with implacable sweetness,\n" +
            "if each day a flower\n" +
            "climbs up to your lips to seek me,\n" +
            "ah my love, ah my own,\n" +
            "in me all that fire is repeated,\n" +
            "in me nothing is extinguished or forgotten,\n" +
            "my love feeds on your love, beloved,\n" +
            "and as long as you live it will be in your arms\n" +
            "without leaving mine\n","The Road Not Taken by Robert Frost\n" +
            "Two roads diverged in a yellow wood,\n" +
            "And sorry I could not travel both\n" +
            "And be one traveler, long I stood\n" +
            "And looked down one as far as I could\n" +
            "To where it bent in the undergrowth;\n" +
            "Then took the other, as just as fair,\n" +
            "And having perhaps the better claim,\n" +
            "Because it was grassy and wanted wear;\n" +
            "Though as for that the passing there\n" +
            "Had worn them really about the same,\n" +
            "And both that morning equally lay\n" +
            "In leaves no step had trodden black.\n" +
            "Oh, I kept the first for another day!\n" +
            "Yet knowing how way leads on to way,\n" +
            "I doubted if I should ever come back.\n" +
            "I shall be telling this with a sigh\n" +
            "Somewhere ages and ages hence:\n" +
            "Two roads diverged in a wood, and I-\n" +
            "I took the one less traveled by,\n" +
            "And that has made all the difference.\n","A Dream Within A Dream by Edgar Allan Poe\n" +
            "Take this kiss upon the brow!\n" +
            "And, in parting from you now,\n" +
            "Thus much let me avow--\n" +
            "You are not wrong, who deem\n" +
            "That my days have been a dream;\n" +
            "Yet if hope has flown away\n" +
            "In a night, or in a day,\n" +
            "In a vision, or in none,\n" +
            "Is it therefore the less gone?\n" +
            "All that we see or seem\n" +
            "Is but a dream within a dream.\n" +
            "\n" +
            "I stand amid the roar\n" +
            "Of a surf-tormented shore,\n" +
            "And I hold within my hand\n" +
            "Grains of the golden sand--\n" +
            "How few! yet how they creep\n" +
            "Through my fingers to the deep,\n" +
            "While I weep--while I weep!\n" +
            "O God! can I not grasp\n" +
            "Them with a tighter clasp?\n" +
            "O God! can I not save\n" +
            "One from the pitiless wave?\n" +
            "Is all that we see or seem\n" +
            "But a dream within a dream?\n","To My Wife - With A Copy Of My Poems by Oscar Wilde\n" +
            "I can write no stately proem\n" +
            "As a prelude to my lay;\n" +
            "From a poet to a poem\n" +
            "I would dare to say.\n" +
            "\n" +
            "For if of these fallen petals\n" +
            "One to you seem fair,\n" +
            "Love will waft it till it settles\n" +
            "On your hair.\n" +
            "\n" +
            "And when wind and winter harden\n" +
            "All the loveless land,\n" +
            "It will whisper of the garden,\n" +
            "You will understand.\n","To You. by Walt Whitman\n" +
            "LET us twain walk aside from the rest;\n" +
            "Now we are together privately, do you discard ceremony,\n" +
            "Come! vouchsafe to me what has yet been vouchsafed to none—Tell me the whole story,\n" +
            "Tell me what you would not tell your brother, wife, husband, or physician.","Bear In There by Shel Silverstein\n" +
            "There's a Polar Bear\n" +
            "In our Frigidaire--\n" +
            "He likes it 'cause it's cold in there.\n" +
            "With his seat in the meat\n" +
            "And his face in the fish\n" +
            "And his big hairy paws\n" +
            "In the buttery dish,\n" +
            "He's nibbling the noodles,\n" +
            "He's munching the rice,\n" +
            "He's slurping the soda,\n" +
            "He's licking the ice.\n" +
            "And he lets out a roar\n" +
            "If you open the door.\n" +
            "And it gives me a scare\n" +
            "To know he's in there--\n" +
            "That Polary Bear\n" +
            "In our Fridgitydaire.","A Birthday Poem by Ted Kooser\n" +
            "Just past dawn, the sun stands\n" +
            "with its heavy red head\n" +
            "in a black stanchion of trees,\n" +
            "waiting for someone to come\n" +
            "with his bucket\n" +
            "for the foamy white light,\n" +
            "and then a long day in the pasture.\n" +
            "I too spend my days grazing,\n" +
            "feasting on every green moment\n" +
            "till darkness calls,\n" +
            "and with the others\n" +
            "I walk away into the night,\n" +
            "swinging the little tin bell\n" +
            "of my name.\n","Be Glad Your Nose is on Your Face by Jack Prelutsky\n" +
            "Be glad your nose is on your face,\n" +
            "not pasted on some other place,\n" +
            "for if it were where it is not,\n" +
            "you might dislike your nose a lot.\n" +
            "\n" +
            "Imagine if your precious nose\n" +
            "were sandwiched in between your toes,\n" +
            "that clearly would not be a treat,\n" +
            "for you'd be forced to smell your feet.\n" +
            "\n" +
            "Your nose would be a source of dread\n" +
            "were it attached atop your head,\n" +
            "it soon would drive you to despair,\n" +
            "forever tickled by your hair.\n" +
            "\n" +
            "Within your ear, your nose would be\n" +
            "an absolute catastrophe,\n" +
            "for when you were obliged to sneeze,\n" +
            "your brain would rattle from the breeze.\n" +
            "\n" +
            "Your nose, instead, through thick and thin,\n" +
            "remains between your eyes and chin,\n" +
            "not pasted on some other place--\n" +
            "be glad your nose is on your face!","“No Man Is An Island” by John Donne\n" +
            "\n" +
            "No man is an island,\n" +
            "Entire of itself,\n" +
            "Every man is a piece of the continent,\n" +
            "A part of the main.\n" +
            "If a clod be washed away by the sea,\n" +
            "Europe is the less.\n" +
            "As well as if a promontory were.\n" +
            "As well as if a manor of thy friend’s\n" +
            "Or of thine own were:\n" +
            "Any man’s death diminishes me,\n" +
            "Because I am involved in mankind,\n" +
            "And therefore never send to know for whom the bell tolls;\n" +
            "It tolls for thee."," “Stopping by Woods On a Snowy Evening” by Robert Frost\n" +
            "\n" +
            "Whose woods these are I think I know.\n" +
            "His house is in the village though;\n" +
            "He will not see me stopping here\n" +
            "To watch his woods fill up with snow.\n" +
            "My little horse must think it queer\n" +
            "To stop without a farmhouse near\n" +
            "Between the woods and frozen lake\n" +
            "The darkest evening of the year.\n" +
            "He gives his harness bells a shake\n" +
            "To ask if there is some mistake.\n" +
            "The only other sound’s the sweep\n" +
            "Of easy wind and downy flake.\n" +
            "The woods are lovely, dark and deep,\n" +
            "But I have promises to keep,\n" +
            "And miles to go before I sleep,\n" +
            "And miles to go before I sleep."," “Still I Rise” by Maya Angelou\n" +
            "You may write me down in history\n" +
            "With your bitter, twisted lies,\n" +
            "You may tread me in the very dirt\n" +
            "But still, like dust, I’ll rise.\n" +
            "Does my sassiness upset you?\n" +
            "Why are you beset with gloom?\n" +
            "’Cause I walk like I’ve got oil wells\n" +
            "Pumping in my living room.\n" +
            "Just like moons and like suns,\n" +
            "With the certainty of tides,\n" +
            "Just like hopes springing high,\n" +
            "Still I’ll rise.\n" +
            "Did you want to see me broken?\n" +
            "Bowed head and lowered eyes?\n" +
            "Shoulders falling down like teardrops.\n" +
            "Weakened by my soulful cries.\n" +
            "Does my haughtiness offend you?\n" +
            "Don’t you take it awful hard\n" +
            "’Cause I laugh like I’ve got gold mines\n" +
            "Diggin’ in my own back yard.\n" +
            "You may shoot me with your words,\n" +
            "You may cut me with your eyes,\n" +
            "You may kill me with your hatefulness,\n" +
            "But still, like air, I’ll rise.\n" +
            "Does my sexiness upset you?\n" +
            "Does it come as a surprise\n" +
            "That I dance like I’ve got diamonds\n" +
            "At the meeting of my thighs?\n" +
            "Out of the huts of history’s shame\n" +
            "I rise\n" +
            "Up from a past that’s rooted in pain\n" +
            "I rise\n" +
            "I’m a black ocean, leaping and wide,\n" +
            "Welling and swelling I bear in the tide.\n" +
            "Leaving behind nights of terror and fear\n" +
            "I rise\n" +
            "Into a daybreak that’s wondrously clear\n" +
            "I rise\n" +
            "Bringing the gifts that my ancestors gave,\n" +
            "I am the dream and the hope of the slave.\n" +
            "I rise\n" +
            "I rise\n" +
            "I rise."," “Shall I Compare Thee To A Summer’s Day?” by William Shakespeare\n" +
            "Shall I compare thee to a summer’s day?\n" +
            "Thou art more lovely and more temperate.\n" +
            "Rough winds do shake the darling buds of May,\n" +
            "And summer’s lease hath all too short a date.\n" +
            "Sometime too hot the eye of heaven shines,\n" +
            "And often is his gold complexion dimmed;\n" +
            "And every fair from fair sometime declines,\n" +
            "By chance, or nature’s changing course, untrimmed;\n" +
            "But thy eternal summer shall not fade,\n" +
            "Nor lose possession of that fair thou ow’st,\n" +
            "Nor shall death brag thou wand’rest in his shade,\n" +
            "When in eternal lines to Time thou grow’st.\n" +
            "So long as men can breathe, or eyes can see,\n" +
            "So long lives this, and this gives life to thee."," “There Will Come Soft Rain” by Sara Teasdale\n" +
            "There will come soft rain and the smell of the ground,\n" +
            "And swallows circling with their shimmering sound;\n" +
            "And frogs in the pools singing at night,\n" +
            "And wild plum trees in tremulous white;\n" +
            "Robins will wear their feathery fire,\n" +
            "Whistling their whims on a low fence-wire;\n" +
            "And not one will know of the war, not one\n" +
            "Will care at last when it is done.\n" +
            "Not one would mind, neither bird nor tree,\n" +
            "If mankind perished utterly;\n" +
            "And Spring herself, when she woke at dawn\n" +
            "Would scarcely know that we were gone.","A Word To Husbands by Ogden Nash\n" +
            "To keep your marriage brimming\n" +
            "With love in the loving cup,\n" +
            "Whenever you’re wrong, admit it;\n" +
            "Whenever you’re right, shut up.","“Humble and Grumble” by Eldred Herbert\n" +
            "Humble and Grumble were identical twins,\n" +
            "And Humble was ever so meek;\n" +
            "Grumble did nothing but grumble all day,\n" +
            "Some may even call him a freak.\n" +
            "\n" +
            "Humble was happy and everyone’s friend,\n" +
            "Grumble was jealous of course;\n" +
            "Humble was happy to follow the Lord,\n" +
            "But Grumble, an immoral source.\n" +
            "\n" +
            "Humble was never seen wearing a frown,\n" +
            "And Grumble, ne’er seen with a smile;\n" +
            "Humble won friends by just being himself,\n" +
            "But, Grumble, he won them by guile.\n" +
            "\n" +
            "So Grumble, please follow Humble, your twin,\n" +
            "And Humble, don’t grumble, I pray,\n" +
            "For grumble will make you like Grumble, your twin,\n" +
            "Please Grumble, be humble today.","“Messy Room” by Shel Silverstein\n" +
            "Whosever room this is should be ashamed!\n" +
            "His underwear is hanging on the lamp.\n" +
            "His raincoat is there in the overstuffed chair,\n" +
            "And the chair is becoming quite mucky and damp.\n" +
            "His workbook is wedged in the window,\n" +
            "His sweater’s been thrown on the floor.\n" +
            "His scarf and one ski are beneath the TV,\n" +
            "And his pants have been carelessly hung on the door.\n" +
            "His books are all jammed in the closet,\n" +
            "His vest has been left in the hall.\n" +
            "A lizard named Ed is asleep in his bed,\n" +
            "And his smelly old sock has been stuck to the wall.\n" +
            "Whosever room this is should be ashamed!\n" +
            "Donald or Robert or Willie or–\n" +
            "Huh? You say it’s mine? Oh, dear,\n" +
            "I knew it looked familiar!","“I Didn’t Go To Church Today” by Ogden Nash\n" +
            "I didn’t go to church today,\n" +
            "I trust the Lord to understand.\n" +
            "The surf was swirling blue and white,\n" +
            "The children swirling on the sand.\n" +
            "He knows, He knows how brief my stay,\n" +
            "How brief this spell of summer weather,\n" +
            "He knows when I am said and done\n" +
            "We’ll have plenty of time together","“Now We Are Six” by A. A. Milne\n" +
            "When I was One,\n" +
            "I had just begun.\n" +
            "When I was Two,\n" +
            "I was nearly new.\n" +
            "When I was Three\n" +
            "I was hardly me.\n" +
            "When I was Four,\n" +
            "I was not much more.\n" +
            "When I was Five,\n" +
            "I was just alive.\n" +
            "But now I am Six,\n" +
            "I’m as clever as clever,\n" +
            "So I think I’ll be six now for ever and ever.","“The Rose Family” by Robert Frost\n" +
            "The rose is a rose,\n" +
            "And was always a rose.\n" +
            "But the theory now goes\n" +
            "That the apple’s a rose,\n" +
            "And the pear is, and so’s\n" +
            "The plum, I suppose.\n" +
            "The dear only knows\n" +
            "What will next prove a rose.\n" +
            "You, of course, are a rose –\n" +
            "But were always a rose.","“When You Come” by Maya Angelou\n" +
            "When you come to me, unbidden,\n" +
            "Beckoning me\n" +
            "To long-ago rooms,\n" +
            "Where memories lie.\n" +
            "\n" +
            "\n" +
            " \n" +
            "Offering me, as to a child, an attic,\n" +
            "Gatherings of days too few.\n" +
            "Baubles of stolen kisses.\n" +
            "Trinkets of borrowed loves.\n" +
            "Trunks of secret words,\n" +
            "\n" +
            "I CRY.","“Sonnet 29” by William Shakespeare\n" +
            "When, in disgrace with fortune and men’s eyes,\n" +
            "I all alone beweep my outcast state,\n" +
            "And trouble deaf heaven with my bootless cries,\n" +
            "And look upon myself and curse my fate,\n" +
            "Wishing me like to one more rich in hope,\n" +
            "Featured like him, like him with friends possessed,\n" +
            "Desiring this man’s art and that man’s scope\n" +
            "With what I most enjoy contented least;\n" +
            "Yet in these thoughts myself almost despising,\n" +
            "Haply I think on thee, and then my state,\n" +
            "(Like to the lark at break of day arising\n" +
            "From sullen earth) sings hymns at heaven’s gate;\n" +
            "For thy sweet love remembered such wealth brings\n" +
            "That then I scorn to change my state with kings.","“It’s All I Have To Bring Today” by Emily Dickinson\n" +
            "It’s all I have to bring today—\n" +
            "This, and my heart beside—\n" +
            "This, and my heart, and all the fields—\n" +
            "And all the meadows wide—\n" +
            "Be sure you count—should I forget\n" +
            "Some one the sum could tell—\n" +
            "This, and my heart, and all the Bees\n" +
            "Which in the Clover dwell.","“A Glimpse” by Walt Whitman\n" +
            "A glimpse through an interstice caught,\n" +
            "Of a crowd of workmen and drivers in a bar-room around the stove late of a winter night, and I unremark’d seated in a corner,\n" +
            "Of a youth who loves me and whom I love, silently approaching and seating himself near, that he may hold me by the hand,\n" +
            "A long while amid the noises of coming and going, of drinking and oath and smutty jest,\n" +
            "There we two, content, happy in being together, speaking little, perhaps not a word.","“A Love Song for Lucinda” by Langston Hughes\n" +
            "Love\n" +
            "Is a ripe plum\n" +
            "Growing on a purple tree.\n" +
            "Taste it once\n" +
            "And the spell of its enchantment\n" +
            "Will never let you be.\n" +
            "\n" +
            "Love\n" +
            "Is a bright star\n" +
            "Glowing in far Southern skies.\n" +
            "Look too hard\n" +
            "And its burning flame\n" +
            "Will always hurt your eyes.\n" +
            "\n" +
            "Love\n" +
            "Is a high mountain\n" +
            "Stark in a windy sky.\n" +
            "If you\n" +
            "Would never lose your breath\n" +
            "Do not climb too high.","“I Love You” by Carl Sandberg\n" +
            "I love you for what you are, but I love you yet more for what you are going to be.\n" +
            "I love you not so much for your realities as for your ideals. I pray for your desires that they may be great, rather than for your satisfactions, which may be so hazardously little.\n" +
            "A satisfied flower is one whose petals are about to fall. The most beautiful rose is one hardly more than a bud wherein the pangs and ecstasies of desire are working for a larger and finer growth. Not always shall you be what you are now. You are going forward toward something great. I am on the way with you and therefore I love you.","“Sonnet XLIII” by Elizabeth Barrett Browning\n" +
            "How do I love thee? Let me count the ways.\n" +
            "I love thee to the depth and breadth and height\n" +
            "My soul can reach, when feeling out of sight\n" +
            "For the ends of being and ideal grace.\n" +
            "I love thee to the level of every day’s\n" +
            "Most quiet need, by sun and candle-light.\n" +
            "I love thee freely, as men strive for right;\n" +
            "I love thee purely, as they turn from praise.\n" +
            "I love thee with the passion put to use\n" +
            "In my old griefs, and with my childhood’s faith.\n" +
            "I love thee with a love I seemed to lose\n" +
            "With my lost saints. I love thee with the breath,\n" +
            "Smiles, tears, of all my life; and, if God choose,\n" +
            "I shall but love thee better after death.","“Defeated by Love” by Rumi\n" +
            "The sky was lit\n" +
            "by the splendor of the moon\n" +
            "\n" +
            "So powerful\n" +
            "I fell to the ground\n" +
            "\n" +
            "Your love\n" +
            "has made me sure\n" +
            "\n" +
            "I am ready to forsake\n" +
            "this worldly life\n" +
            "and surrender\n" +
            "to the magnificence\n" +
            "of your Being","“Love Is A Place” by E.E. Cummings\n" +
            "Love is a place\n" +
            "& through this place of\n" +
            "love move\n" +
            "(with brightness of peace)\n" +
            "all places\n" +
            "\n" +
            "yes is a world\n" +
            "& in this world of\n" +
            "yes live\n" +
            "(skilfully curled)\n" +
            "all worlds","“Your Feet” by Pablo Neruda\n" +
            "When I cannot look at your face\n" +
            "I look at your feet.\n" +
            "Your feet of arched bone,\n" +
            "your hard little feet.\n" +
            "I know that they support you,\n" +
            "and that your sweet weight\n" +
            "rises upon them.\n" +
            "Your waist and your breasts,\n" +
            "the doubled purple\n" +
            "of your nipples,\n" +
            "the sockets of your eyes\n" +
            "that have just flown away,\n" +
            "your wide fruit mouth,\n" +
            "your red tresses,\n" +
            "my little tower.\n" +
            "But I love your feet\n" +
            "only because they walked\n" +
            "upon the earth and upon\n" +
            "the wind and upon the waters,\n" +
            "until they found me.","“Never Give All The Heart” by W.B Yeats\n" +
            "Never give all the heart, for love\n" +
            "Will hardly seem worth thinking of\n" +
            "To passionate women if it seem\n" +
            "Certain, and they never dream\n" +
            "That it fades out from kiss to kiss;\n" +
            "For everything that’s lovely is\n" +
            "But a brief, dreamy, kind delight.\n" +
            "O never give the heart outright,\n" +
            "For they, for all smooth lips can say,\n" +
            "Have given their hearts up to the play.\n" +
            "And who could play it well enough\n" +
            "If deaf and dumb and blind with love?\n" +
            "He that made this knows all the cost,\n" +
            "For he gave all his heart and lost.","“You Fit Into Me” by Margaret Atwood\n" +
            "you fit into me\n" +
            "like a hook into an eye\n" +
            "\n" +
            "a fish hook\n" +
            "an open eye\n" +
            "\n","“Fire and Ice” by Robert Frost\n" +
            "Some say the world will end in fire,\n" +
            "Some say in ice.\n" +
            "From what I’ve tasted of desire\n" +
            "I hold with those who favor fire.\n" +
            "But if it had to perish twice,\n" +
            "I think I know enough of hate\n" +
            "To say that for destruction ice\n" +
            "Is also great\n" +
            "And would suffice.","“Risk” by Anais Nin\n" +
            "And then the day came,\n" +
            "when the risk\n" +
            "to remain tight\n" +
            "in a bud\n" +
            "was more painful\n" +
            "than the risk\n" +
            "it took\n" +
            "to blossom.\n" +
            "\n","“Awakening In New York” by Maya Angelou\n" +
            "Curtains forcing their will\n" +
            "against the wind,\n" +
            "children sleep,\n" +
            "exchanging dreams with\n" +
            "seraphim. The city\n" +
            "drags itself awake on\n" +
            "subway straps; and\n" +
            "I, an alarm, awake as a\n" +
            "rumor of war\n" +
            "lie stretching into dawn\n" +
            "unasked and unheeded.","“Housekeeping” by Natasha Tretheway\n" +
            "We mourn the broken things, chair legs\n" +
            "wrenched from their seats, chipped plates,\n" +
            "the threadbare clothes. We work the magic\n" +
            "of glue, drive the nails, mend the holes.\n" +
            "We save what we can, melt small pieces\n" +
            "of soap, gather fallen pecans, keep neck bones\n" +
            "for soup. Beating rugs against the house,\n" +
            "we watch dust, lit like stars, spreading\n" +
            "across the yard. Late afternoon, we draw\n" +
            "the blinds to cool the rooms, drive the bugs\n" +
            "out. My mother irons, singing, lost in reverie.\n" +
            "I mark the pages of a mail-order catalog,\n" +
            "listen for passing cars. All day we watch\n" +
            "for the mail, some news from a distant place.","“Church” by Jacqueline Woodson\n" +
            "On Sundays, the preacher gives everyone a chance\n" +
            "to repent their sins. Miss Edna makes me go\n" +
            "to church. She wears a bright hat\n" +
            "I wear my suit. Babies dress in lace.\n" +
            "Girls my age, some pretty, some not so\n" +
            "pretty. Old ladies and men nodding.\n" +
            "Miss Edna every now and then throwing her hand\n" +
            "in the air. Saying Yes, Lord and Preach!\n" +
            "I sneak a pen from my back pocket,\n" +
            "bend down low like I dropped something.\n" +
            "The chorus marches up behind the preacher\n" +
            "clapping and humming and getting ready to sing.\n" +
            "I write the word HOPE on my hand.","“September Tomatoes” by Karina Borowicz\n" +
            "The whiskey stink of rot has settled\n" +
            "in the garden, and a burst of fruit flies rises\n" +
            "when I touch the dying tomato plants.\n" +
            "Still, the claws of tiny yellow blossoms\n" +
            "flail in the air as I pull the vines up by the roots\n" +
            "and toss them in the compost.\n" +
            "It feels cruel. Something in me isn’t ready\n" +
            "to let go of summer so easily. To destroy\n" +
            "what I’ve carefully cultivated all these months.\n" +
            "Those pale flowers might still have time to fruit.\n" +
            "My great-grandmother sang with the girls of her village\n" +
            "as they pulled the flax. Songs so old\n" +
            "and so tied to the season that the very sound\n" +
            "seemed to turn the weather.","“Good Bones” by Maggie Smith\n" +
            "Life is short, though I keep this from my children.\n" +
            "Life is short, and I’ve shortened mine\n" +
            "in a thousand delicious, ill-advised ways,\n" +
            "a thousand deliciously ill-advised ways\n" +
            "I’ll keep from my children. The world is at least\n" +
            "fifty percent terrible, and that’s a conservative\n" +
            "estimate, though I keep this from my children.\n" +
            "For every bird there is a stone thrown at a bird.\n" +
            "For every loved child, a child broken, bagged,\n" +
            "sunk in a lake. Life is short and the world\n" +
            "is at least half terrible, and for every kind\n" +
            "stranger, there is one who would break you,\n" +
            "though I keep this from my children. I am trying\n" +
            "to sell them the world. Any decent realtor,\n" +
            "walking you through a real shithole, chirps on\n" +
            "about good bones: This place could be beautiful,\n" +
            "right? You could make this place beautiful."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_english);
        final TextView engtry=(TextView)findViewById(R.id.engtry);
        i=0;
        engtry.setText(EnglishPoems[0]);
        Button nextPoem = findViewById(R.id.nextPoem);
        nextPoem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {i++;
                if(i==41){i=0;}
                engtry.setText(EnglishPoems[i]);
            }
        });
        Button previousPoem = findViewById(R.id.previousPoem);
        previousPoem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                if(i==-1){i=40;}
                engtry.setText(EnglishPoems[i]);
            }
        });
        Button home_fromEng= findViewById(R.id.home_fromEng);
        home_fromEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainIntent);
            }
        });

    }
}
