package org.graviton.game.action.npc;

import org.graviton.game.action.Action;
import org.graviton.game.action.common.GameAction;
import org.graviton.game.breeds.AbstractBreed;
import org.graviton.network.game.GameClient;
import org.graviton.network.game.protocol.GamePacketFormatter;
import org.graviton.network.game.protocol.MessageFormatter;

/**
 * Created by Botan on 09/12/2016. 09:23
 */

@GameAction(id=229)
public class AstrubTransportation implements Action {
    @Override
    public void apply(GameClient client, Object data) {
        client.getBaseHandler().getDialogHandler().leaveDialog();

        client.send(GamePacketFormatter.astrubAnimationMessage(client.getPlayer().getId()));
        client.send(MessageFormatter.savedPositionMessage());

        AbstractBreed breed = client.getPlayer().getBreed();
        client.getPlayer().changeMap(breed.astrubMap(), breed.astrubCell());
        client.getPlayer().setSavedLocation(client.getPlayer().getLocation().copy());
    }

    @Override
    public void finish() {

    }
}
