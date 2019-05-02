package org.tain.repository;

import org.springframework.data.repository.CrudRepository;
import org.tain.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

}
