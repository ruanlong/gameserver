package lucas.core.game.player;


import lucas.core.game.player.entity.PlayerEntity;
import lucas.core.socket.net.session.GameSession;

/**
 * @author lushengkao vip8
 * 2018/11/9 14:19
 */
public class Player {

    private PlayerEntity entity;

    private GameSession session;

    public long getPlayerId() {
        return session.getPlayerId();
    }

    public GameSession getSession() {
        return session;
    }

    public void setSession(GameSession session) {
        this.session = session;
    }

    public String getName() {
        return entity.getName();
    }

    public void setName(String name) {
        entity.setName(name);
    }

    public void setEntity(PlayerEntity entity) {
        this.entity = entity;
    }
}
