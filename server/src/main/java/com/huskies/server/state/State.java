package com.huskies.server.state;

import com.huskies.server.district.District;
import com.huskies.server.districtPlan.DistrictPlan;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "State")
@Table(name = "states")
public class State {
    @Id private String id;


    @OneToMany(mappedBy = "states")
    private Set<DistrictPlan> plans;
    public State() {}

    public State(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Set<DistrictPlan> getPlans() {
        return plans;
    }

    public void setPlans(Set<DistrictPlan> plans) {
        this.plans = plans;
    }
}