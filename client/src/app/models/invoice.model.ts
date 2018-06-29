import { Company } from './company.model'

export interface Invoice {
  id: number,
  invoiceDescription: String,
  createdOn: Date,
  recordIds: number[]
}
