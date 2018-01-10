package demo_web;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class TestDome4j {
	@Test
	public void test1() throws DocumentException {
		SAXReader reader = new SAXReader();// ����һ��xml��������
		Document document = reader.read("src/Book.xml");// ��xml�ĵ����ص�document������
		// �����ص��ڴ���
		Element root = document.getRootElement();// �õ�xml�ĸ��ڵ�
		@SuppressWarnings("rawtypes")
		List list = root.elements();// �õ���ǰ���е��ӽڵ㡣
		Element temp = (Element) list.get(1);// �õ��ڶ�����Ķ���
		System.out.println(temp.element("����").getText());
	}

	public void test2() throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read("src/Book.xml");
		Element root = document.getRootElement();// ��ȡ���ڵ�
		treeWalk(root);
	}

	private void treeWalk(Element root) {
		// TODO Auto-generated method stub
		System.out.println(root.getName());
		for (int i = 0; i < root.nodeCount(); i++) {
			Node node = root.node(i);
			if (node instanceof Element) {
				treeWalk((Element) node);
			} else {
				System.out.println(node.getText());
			}
		}
	}

	public static void main(String[] args) throws DocumentException {
		new TestDome4j().test2();
	}
}