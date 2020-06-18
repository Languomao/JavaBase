package telemetryparse.topologybeans;

/**
 * Classname ContentObject
 * Date 2020/6/15 16:28
 * Created by LanKorment
 */
public class ContentObject {
    public int adjacency_sids;
    public int links;
    public int nodes;
    public int prefix_sids;
    public int prefixes;

    public int getAdjacencysids() {
        return adjacency_sids;
    }

    public void setAdjacency_sids(int adjacency_sids) {
        this.adjacency_sids = adjacency_sids;
    }

    public int getLinks() {
        return links;
    }

    public void setLinks(int links) {
        this.links = links;
    }

    public int getNodes() {
        return nodes;
    }

    public void setNodes(int nodes) {
        this.nodes = nodes;
    }

    public int getPrefix_sids() {
        return prefix_sids;
    }

    public void setPrefix_sids(int prefixsids) {
        this.prefix_sids = prefixsids;
    }

    public int getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(int prefixes) {
        this.prefixes = prefixes;
    }

    @Override
    public String toString() {
        return "Content[adjacency-sids = " + adjacency_sids + ",links" + links + ",nodes = " + nodes + ",prefix-sids" + prefix_sids + ",prefixes = " + prefixes + "]";
    }
}
