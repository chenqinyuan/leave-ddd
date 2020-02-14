package com.yeahzee.lab.leave.query.dto;

import com.yeahzee.lab.leave.application.dto.ApproverDTO;
import lombok.Data;

import java.util.List;

@Data
public class LeaveDTO {

    String leaveId;
    ApplicantDTO applicantDTO;
    ApproverDTO approverDTO;
    String leaveType;
    ApprovalInfoDTO currentApprovalInfoDTO;
    List<ApprovalInfoDTO> historyApprovalInfoDTOList;
    String startTime;
    String endTime;
    long duration;
    String status;

}
