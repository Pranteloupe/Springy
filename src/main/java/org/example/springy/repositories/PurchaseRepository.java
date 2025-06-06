package org.example.springy.repositories;

import org.example.springy.models.Purchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Long> {}
//@Repository
//public class PurchaseRepository {
//    private final JdbcTemplate jdbcTemplate;
//
//    public PurchaseRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public void storePurchase(Purchase purchase) {
//        String sql = "INSERT INTO purchases (id, product, price) VALUES (?, ?, ?)";
//
//        jdbcTemplate.update(sql, purchase.getId(), purchase.getProduct(), purchase.getPrice());
//    }
//
//    public List<Purchase> getAllPurchases() {
//        String sql = "SELECT * FROM purchases";
//
//        RowMapper<Purchase> purchaseRowMapper = (rs, rowNum) -> {
//            Purchase purchase = new Purchase();
//            purchase.setId(rs.getInt("id"));
//            purchase.setProduct(rs.getString("product"));
//            purchase.setPrice(rs.getBigDecimal("price"));
//            return purchase;
//        };
//
//        return jdbcTemplate.query(sql, purchaseRowMapper);
//    }
//}
