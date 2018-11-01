package org.healtheta.model.adverse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.healtheta.model.common.CodeableConcept;
import org.healtheta.model.common.Reference;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "_AdverseEventSuspectEntity")
public class AdverseEventSuspectEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_instance")
    private Reference instance;

    @Column(name = "_casuality")
    private String casuality;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_causalityAssessment")
    private CodeableConcept causalityAssessment;

    @Column(name = "_causalityProductRelatedness\t")
    private String causalityProductRelatedness	;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_causalityMethod")
    private CodeableConcept causalityMethod;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_causalityAuthor")
    private Reference causalityAuthor;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_causalityResult")
    private CodeableConcept causalityResult;

    public Long getId() {
        return id;
    }

    public Reference getInstance() {
        return instance;
    }

    public String getCasuality() {
        return casuality;
    }

    public CodeableConcept getCausalityAssessment() {
        return causalityAssessment;
    }

    public String getCausalityProductRelatedness() {
        return causalityProductRelatedness;
    }

    public CodeableConcept getCausalityMethod() {
        return causalityMethod;
    }

    public Reference getCausalityAuthor() {
        return causalityAuthor;
    }

    public CodeableConcept getCausalityResult() {
        return causalityResult;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setInstance(Reference instance) {
        this.instance = instance;
    }

    public void setCasuality(String casuality) {
        this.casuality = casuality;
    }

    public void setCausalityAssessment(CodeableConcept causalityAssessment) {
        this.causalityAssessment = causalityAssessment;
    }

    public void setCausalityProductRelatedness(String causalityProductRelatedness) {
        this.causalityProductRelatedness = causalityProductRelatedness;
    }

    public void setCausalityMethod(CodeableConcept causalityMethod) {
        this.causalityMethod = causalityMethod;
    }

    public void setCausalityAuthor(Reference causalityAuthor) {
        this.causalityAuthor = causalityAuthor;
    }

    public void setCausalityResult(CodeableConcept causalityResult) {
        this.causalityResult = causalityResult;
    }
}
