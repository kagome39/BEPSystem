package com.prac.BEPSystem.pojo;

public class ProjectInfo {
    private Integer projectId;
    private String projectName;
    private String projectPublishAccount;
    private String projectClassification;
    private String projectDescription;
    private float projectBudget;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectPublishAccount() {
        return projectPublishAccount;
    }

    public void setProjectPublishAccount(String projectPublishAccount) {
        this.projectPublishAccount = projectPublishAccount;
    }

    public String getProjectClassification() {
        return projectClassification;
    }

    public void setProjectClassification(String projectClassification) {
        this.projectClassification = projectClassification;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public float getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(float projectBudget) {
        this.projectBudget = projectBudget;
    }

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectPublishAccount='" + projectPublishAccount + '\'' +
                ", projectClassification='" + projectClassification + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", projectBudget=" + projectBudget +
                '}';
    }
}