package telemetryparse.cpubeans;

/**
 * Classname RowsObject
 * Date 2020/6/15 15:43
 * Created by LanKorment
 */
public class RowsObject {
    public long row_timestamp;
    public KeysObject keys;
    public ContentObject content;

    public long getRow_timestamp() {
        return row_timestamp;
    }

    public void setRow_timestamp(long row_timestamp) {
        this.row_timestamp = row_timestamp;
    }

    public KeysObject getKeys() {
        return keys;
    }

    public void setKeys(KeysObject keys) {
        this.keys = keys;
    }

    public ContentObject getContent() {
        return content;
    }

    public void setContent(ContentObject content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Rows[Timestamp = " + row_timestamp + ",Keys = " + keys + ",Content = " + content + "]";
    }
}
