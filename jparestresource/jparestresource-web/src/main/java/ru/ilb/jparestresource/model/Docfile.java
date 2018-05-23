/**
 * This file was generated by the JPA Modeler
 */
package ru.ilb.jparestresource.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import ru.ilb.common.jpa.history.AutoHistory;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Entity
@AutoHistory
public class Docfile implements Serializable {

    @Column(nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * File comment
     */
    @Basic
    private String comment;

    /**
     * Confirmation status
     */
    @Basic
    private Boolean confirm;

    /**
     * User created
     */
    @Basic
    private String userName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCUMENT_ID", referencedColumnName = "ID", nullable = false)
    @XmlTransient
    private Document document;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Docfile withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get file comment
     *
     * @return {@link #comment}
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * Set file comment
     *
     * @param comment {@link #comment}
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Docfile withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get confirmation status
     *
     * @return {@link #confirm}
     */
    public Boolean isConfirm() {
        return this.confirm;
    }

    /**
     * Set confirmation status
     *
     * @param confirm {@link #confirm}
     */
    public void setConfirm(Boolean confirm) {
        this.confirm = confirm;
    }

    public Docfile withConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }

    /**
     * Get user created
     *
     * @return {@link #userName}
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Set user created
     *
     * @param userName {@link #userName}
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Docfile withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Document getDocument() {
        return this.document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Docfile withDocument(Document document) {
        this.document = document;
        return this;
    }

}