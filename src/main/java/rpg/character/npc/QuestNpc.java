package rpg.character.npc;

import rpg.character.Character;
import rpg.map.localization.Position;
import rpg.quest.Quest;
import rpg.quest.QuestId;
import rpg.quest.reward.QuestReward;

import java.util.ArrayList;
import java.util.Optional;

public class QuestNpc extends Npc implements Questable {

    private ArrayList<Quest> offeredQuests = new ArrayList<Quest>();

    public QuestNpc(String npcId, String name, Position location, String conversation) {
        super(npcId, name, location, conversation);
    }

    public ArrayList<Quest> offerQuest() {
        return this.offeredQuests;
    }

    public Quest startQuest(final QuestId questId) {
        return this.findQuest(questId);
    }

    public QuestReward finishQuest(QuestId questId) {
        Quest toFinishQuest = this.findQuest(questId);
        return toFinishQuest.getQuestReward();
    }

    private void validateQuestConditions() {
        // TODO
    }

    private Quest findQuest(QuestId questId) {
        Optional<Quest> finishedQuest = offeredQuests.stream()
                .filter((quest) -> quest.getQuestId() == questId)
                .findFirst();

        if(finishedQuest.isPresent()){
            return finishedQuest.get();
        }
        else {
            return null;
        }
    }

    @Override
    public Character getCharacter() {
        return this;
    }
}
