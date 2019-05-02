package org.tain;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tain.repository.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTests {

	@Autowired
	private BoardRepository boardRepository;
	
	@Test
	public void inspect() {
		Class<?> clazz = this.boardRepository.getClass();
		System.out.println(">>>>> " + clazz.getName());
		
		Class<?>[] interfaces = clazz.getInterfaces();
		Stream.of(interfaces).forEach(inter -> System.out.println(">>>>>>>>>> " + inter.getName()));
		
		Class<?> superClass = clazz.getSuperclass();
		System.out.println(">>>>>>>>>>>>>>> " + superClass.getName());
	}
}
