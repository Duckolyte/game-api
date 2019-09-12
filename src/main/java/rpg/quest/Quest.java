package rpg.quest;

import rpg.quest.condition.QuestCondition;
import rpg.quest.reward.QuestReward;

public abstract class Quest {

    private QuestId questId;
    private String title;
    private String abstractDescription;
    private String description;
    private QuestCondition condition;
    private boolean isQuestFulfilled;
    private QuestReward questReward;

    public abstract void updateQuestCondition();

    public abstract boolean isQuestFulfilled();

    public QuestId getQuestId() {
        return questId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractDescription() {
        return abstractDescription;
    }

    public void setAbstractDescription(String abstractDescription) {
        this.abstractDescription = abstractDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QuestCondition getCondition() {
        return condition;
    }

    public void setCondition(QuestCondition condition) {
        this.condition = condition;
    }

    public void setQuestFulfilled(boolean questFulfilled) {
        isQuestFulfilled = questFulfilled;
    }

    public QuestReward getQuestReward() {
        return questReward;
    }
}
