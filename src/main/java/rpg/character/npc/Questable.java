package rpg.character.npc;

import rpg.quest.Quest;
import rpg.quest.QuestId;
import rpg.quest.reward.QuestReward;

import java.util.ArrayList;

public interface Questable {

    public ArrayList<Quest> offerQuest();
    public Quest startQuest(QuestId questId);
    public QuestReward finishQuest(QuestId questId);

}
