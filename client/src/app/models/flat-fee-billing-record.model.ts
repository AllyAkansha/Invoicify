import { Company } from './company.model'

export interface FlatFeeBillingRecord {
  id: number,
  company: Company,
  description: String,
  amount: number
}
