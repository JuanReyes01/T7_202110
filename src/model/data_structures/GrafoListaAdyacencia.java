package model.data_structures;

public class GrafoListaAdyacencia<K extends Comparable<K>, V> implements IGrafoListaAdyacencia<K, V>{

	@Override
	public boolean containsVertex(K id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int numVertices() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numEdges() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertVertex(K id, V value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEdge(K source, K dest, float weight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vertex<K, V> getVertex(K id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Edge<K, V> getEdge(K idS, K idD) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ILista<Edge<K, V>> adjacentEdges(K id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void adjacentVertex(K id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int indegree(K vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int outdegree(K vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ILista<Edge<K, V>> edges() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public ILista<Vertex<K, V>> vertices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void unmark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dfs(K id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bfs(K id) {
		// TODO Auto-generated method stub
		
	}

}
