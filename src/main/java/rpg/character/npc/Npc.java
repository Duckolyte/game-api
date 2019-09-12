package rpg.character.npc;

import rpg.character.Character;
import rpg.map.localization.Position;

public abstract class Npc implements Character {

    private String npcId;
    private String name;
    private Position location;
    private String conversation;

    public Npc(String npcId, String name, Position location, String conversation) {
        this.npcId = npcId;
        this.name = name;
        this.location = location;
        this.conversation = conversation;
    }




}
