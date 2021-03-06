package lucas.rpcapi.serverteam.model;

/**
 * @author lushengkao vip8
 * 2018/12/10 13:28
 */
public class TeamPlayer {

    private String account;

    private long playerId;

    private int level;

    private long teamId;

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public TeamPlayer() {
    }
}
