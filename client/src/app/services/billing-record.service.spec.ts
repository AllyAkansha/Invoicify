import { TestBed, inject } from '@angular/core/testing';

import { BillingRecordService } from './billing-record.service';

describe('BillingRecordService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [BillingRecordService]
    });
  });

  it('should be created', inject([BillingRecordService], (service: BillingRecordService) => {
    expect(service).toBeTruthy();
  }));
});
