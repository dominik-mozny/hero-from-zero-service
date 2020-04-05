package cz.mozny.dominik.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActivityRepository extends MongoRepository<Activity, Long> {
}
