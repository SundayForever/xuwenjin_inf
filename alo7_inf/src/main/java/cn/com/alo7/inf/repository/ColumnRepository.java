package cn.com.alo7.inf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.com.alo7.inf.entity.Column;

/**
 * 栏目dao
 * @author mazan
 *
 */
@Repository
public interface ColumnRepository extends JpaRepository<Column, Long> {
	/**
	 * 通过deleteFlag相等查询
	 * @param deleteFlag
	 * @return
	 */
	List<Column> findByDeleteFlag(String deleteFlag);
}
