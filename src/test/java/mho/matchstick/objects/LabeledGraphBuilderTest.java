package mho.matchstick.objects;

import org.junit.Test;

import static org.junit.Assert.*;

public class LabeledGraphBuilderTest {
    @Test
    public void placeholder() {
        LabeledGraphBuilder<Character> lgb = new LabeledGraphBuilder<>();
        lgb.addEdge('a', 'b');
        lgb.addEdge('a', 'e');
        lgb.addEdge('b', 'e');
        lgb.addEdge('b', 'c');
        lgb.addEdge('d', 'c');
        lgb.addEdge('f', 'd');
        lgb.addEdge('d', 'e');
        assertEquals(lgb.toLabeledGraph().toString(), "[(a, b), (a, e), (b, c), (b, e), (c, d), (d, e), (d, f)]");
        lgb.addNode('!');
        assertEquals(lgb.toLabeledGraph().toString(), "[!, (a, b), (a, e), (b, c), (b, e), (c, d), (d, e), (d, f)]");
    }
}
