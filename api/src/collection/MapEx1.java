package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * key, value ������ ����
 * key ���� �ߺ� �ȵ�, value�� �ߺ� ����
 * 
 */
public class MapEx1 {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		
		//��� �߰�
		map.put("id_0123", "ȫ�浿");
		map.put("id_0124", "��浿");
		map.put("id_0125", "�ֱ浿");
		map.put("id_0126", "�ڱ浿");
		
		System.out.println("Ű�� �ش��ϴ� �� �������� "+map.get("id_0123"));
		System.out.println("Ű�� �����ϴ��� Ȯ���ϱ� "+map.containsKey("id_0123"));
		System.out.println("Ű�� �����ϴ��� Ȯ���ϱ� "+map.containsValue("��浿"));
		System.out.println("Map�� ����ִ��� Ȯ���ϱ� "+map.isEmpty());
		System.out.println("Map ũ�� "+map.size());
		System.out.println("Map ��� ���� "+map.remove("id_0126"));
		
		//Ű ���� ��������
		Set<String> keys=map.keySet();
		System.out.println(keys);
		
		//value ���� ��������
		Collection<String> values=map.values();
		System.out.println(values);
		
		System.out.println();
		
		Iterator<String> keyIter=keys.iterator();
		while(keyIter.hasNext()) {
			String key=keyIter.next();
			String value=map.get(key);
			System.out.println();
		}
	}
}
