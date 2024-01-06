package paymentservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import paymentservice.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
