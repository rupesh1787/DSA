Select stock_name , 
sum(CASE WHEN operation='Buy' Then -price ELse +price END) as capital_gain_loss
from Stocks
group by stock_name
order by capital_gain_loss