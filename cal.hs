dis' :: (Num a) => (a, a) -> (a, a) -> a
dis' (x1, y1) (x2, y2) = (x2 - x1) ^ 2 + (y2 - y1) ^ 2

cal' :: (Num a) => (a, a) -> [(a, a)] -> a -> a
cal' (a, b) [] r = r
cal' (a, b) (x:xs) r = do
    let n = dis' (a, b) x
    cal' (a, b) xs (r + 1)

cal :: (Num a) => [(a, a)] -> a -> a
cal (x:[]) r = r
cal (x:xs) r = do
    let n = cal' x xs r
    cal xs n

main :: IO ()
main = print $ cal (zip (take 70000 [a | a <- [1,5..]]) (take 70000 [a | a <- [1,3..]])) 0
