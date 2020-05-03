package com.onTheTop.services.specification;

import com.onTheTop.api.rest.dto.UserRequest;
import com.onTheTop.domain.model.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.criteria.Predicate;

@Component
public class UserGetAllSpecification {
    public Specification<User> getSpecification() {
        return (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            Optional.ofNullable(criteriaBuilder.isNotNull(root.get("email"))).ifPresent(predicates::add);
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
