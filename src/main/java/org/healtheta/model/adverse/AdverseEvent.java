package org.healtheta.model.adverse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.healtheta.model.common.CodeableConcept;
import org.healtheta.model.common.Identifier;
import org.healtheta.model.common.Reference;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "AdverseEvent")
public class AdverseEvent {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(unique=true, name = "_identifier")
    private Identifier identifier;

    @Column(name = "_category")
    private String category

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_type")
    private CodeableConcept type;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_subject")
    private Reference subject;

    @Column(name = "_dateTime")
    private Date dateTime;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "_reaction")
    private List<Reference> reaction;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_location")
    private Reference location;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_seriousness")
    private CodeableConcept seriousness;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_outcome")
    private CodeableConcept outcome;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_recorder")
    private Reference recorder;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_eventParticipant")
    private Reference eventParticipant;

    @Column(name = "_description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "_suspectEntity")
    private List<AdverseEventSuspectEntity>  suspectEntity;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "_subjectMedicalHistory")
    private List<Reference>  subjectMedicalHistory;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "_referenceDocument")
    private List<Reference>  referenceDocument;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_reference")
    private Reference reference;

    public Long getId() {
        return id;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public String getCategory() {
        return category;
    }

    public CodeableConcept getType() {
        return type;
    }

    public Reference getSubject() {
        return subject;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public List<Reference> getReaction() {
        return reaction;
    }

    public Reference getLocation() {
        return location;
    }

    public CodeableConcept getSeriousness() {
        return seriousness;
    }

    public CodeableConcept getOutcome() {
        return outcome;
    }

    public Reference getRecorder() {
        return recorder;
    }

    public Reference getEventParticipant() {
        return eventParticipant;
    }

    public String getDescription() {
        return description;
    }

    public List<AdverseEventSuspectEntity> getSuspectEntity() {
        return suspectEntity;
    }

    public List<Reference> getSubjectMedicalHistory() {
        return subjectMedicalHistory;
    }

    public List<Reference> getReferenceDocument() {
        return referenceDocument;
    }

    public Reference getReference() {
        return reference;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(CodeableConcept type) {
        this.type = type;
    }

    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public void setReaction(List<Reference> reaction) {
        this.reaction = reaction;
    }

    public void setLocation(Reference location) {
        this.location = location;
    }

    public void setSeriousness(CodeableConcept seriousness) {
        this.seriousness = seriousness;
    }

    public void setOutcome(CodeableConcept outcome) {
        this.outcome = outcome;
    }

    public void setRecorder(Reference recorder) {
        this.recorder = recorder;
    }

    public void setEventParticipant(Reference eventParticipant) {
        this.eventParticipant = eventParticipant;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSuspectEntity(List<AdverseEventSuspectEntity> suspectEntity) {
        this.suspectEntity = suspectEntity;
    }

    public void setSubjectMedicalHistory(List<Reference> subjectMedicalHistory) {
        this.subjectMedicalHistory = subjectMedicalHistory;
    }

    public void setReferenceDocument(List<Reference> referenceDocument) {
        this.referenceDocument = referenceDocument;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
