SET foreign_key_checks=1;

USE teamdb;

INSERT INTO mst_user
(user_name, password, family_name, first_name, family_name_kana, first_name_kana, gender) VALUES 
('taro@gmail.com', '111111', '山田', '太郎', 'やまだ', 'たろう', 0);

INSERT INTO mst_category (category_name,category_description) VALUES
('Day care', '朝・日中のスキンケア商品カテゴリーです'),
('Night care', '夜・就寝前のケア商品カテゴリーです'),
('Other item', 'その他の美容・健康関連商品カテゴリーです');

INSERT INTO mst_product(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company) VALUES 
('朝用洗顔フォーム', 'あさようせんがんふぉーむ', '泡立ち良く肌に優しい洗顔料', 1, 980, '/img/morning_face_wash.png', '2025/3/15', 'ビューティーラボ'),
('朝用化粧水', 'あさようけしょうすい', '敏感肌にも使える化粧水', 1, 1450, '/img/morning_toner.png', '2025/3/15', 'スキンケア研究所'),
('朝用乳液', 'あさようにゅうえき', '高保湿の乳液', 1, 1250, '/img/morning_emulsion.png', '2025/3/10', 'スキンケア研究所'),
('保湿ジェル', 'ほしつじぇる', '軽やかなつけ心地の保湿ジェル', 1, 2360, '/img/gel.png', '2025/4/10', 'ナチュラルビューティー'),
('日焼け止め', 'ひやけどめ', '高い紫外線防止効果', 1, 1000, '/img/sunscreen.png', '2025/3/25', 'サンケア専門店'),
('夜用洗顔フォーム', 'よるようせんがんふぉーむ', '一日の汚れをしっかり落とす洗顔料', 2, 1100, '/img/night_face_wash.png', '2025/3/15', 'ビューティーラボ'),
('夜用化粧水', 'よるようけしょうすい', '肌修復をサポートする化粧水', 2, 2110, '/img/night_toner.png', '2025/3/10', 'スキンケア研究所'),
('夜用乳液', 'よるようにゅうえき', '就寝中の肌をケアする夜用乳液', 2, 2300, '/img/night_emulsion.png', '2025/3/5', 'スキンケア研究所'),
('入浴剤', 'にゅうよくざい', 'リラックス効果', 2, 850, '/img/bath_bomb.png', '2025/4/3', 'バスタイム用品店'),
('ヘアケア', 'へあけあ', '集中補修でダメージヘアをケア', 2, 1500, '/img/hair_care_products.png', '2025/3/5', 'ヘアビューティー'),
('栄養ドリンク', 'えいようどりんく', '疲労回復とエネルギー補給に', 3, 250,'/img/energy_drink.png','2025/4/10','ヘルスドリンク'),
('ハーブティー', 'はーぶてぃー', 'リラックス効果のあるハーブティー', 3, 1000,'/img/herb_tea.png','2025/3/15','ハーブガーデン'),
('MCTオイル入りコーヒー', 'えむしーてぃーおいるいりこーひー', 'MCTオイル配合のダイエットコーヒー', 3, 1650,'/img/mct_coffee.png','2025/3/15','ヘルシーカフェ'),
('CBDオイル', 'しーびーでぃーおいる', 'ストレス軽減効果のあるCBDオイル', 3, 3650,'/img/cbd_oil.png','2025/2/15','ウェルネスケア'),
('アイマスク', 'あいますく', '眼精疲労とリラックス効果のあるホットアイマスク', 3, 1200,'/img/hot_eyemask.png','2025/2/20','リラクゼーションストア'),
('保湿クリーム', 'ほしつくりーむ', '乾燥を防ぐ濃密保湿クリーム', 3, 1050,'/img/moisturizing_cream.png','2025/4/11','モイスチャーケア');
