package com.emmeliejohansson.accounts.controller;


import com.emmeliejohansson.accounts.constants.AccountsConstants;
import com.emmeliejohansson.accounts.dto.CustomerDto;
import com.emmeliejohansson.accounts.dto.ResponseDto;
import com.emmeliejohansson.accounts.entity.Customer;
import com.emmeliejohansson.accounts.repository.CustomerRepository;
import com.emmeliejohansson.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = (MediaType.APPLICATION_JSON_VALUE))
@AllArgsConstructor
public class AccountsController {

    private IAccountsService iAccountsService;
    private final CustomerRepository customerRepository;


    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }
}
