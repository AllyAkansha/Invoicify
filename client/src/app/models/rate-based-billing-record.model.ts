import { Company } from './company.model'

export interface RateBasedBillingRecord {
  id: number,
  company: Company,
  description: String,
  rate: number,
  quanity: number
}
