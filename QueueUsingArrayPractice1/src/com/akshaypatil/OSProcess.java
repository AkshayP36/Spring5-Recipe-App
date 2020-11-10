package com.akshaypatil;

import java.util.Objects;

public class OSProcess {

    private String processName;
    private int processId;

    public OSProcess(String processName, int processId) {
        this.processName = processName;
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OSProcess osProcess = (OSProcess) o;
        return processId == osProcess.processId &&
                processName.equals(osProcess.processName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processName, processId);
    }

    @Override
    public String toString() {
        return "OSProcess{" +
                "processName='" + processName + '\'' +
                ", processId=" + processId +
                '}';
    }
}
